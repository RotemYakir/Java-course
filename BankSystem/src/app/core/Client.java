package app.core;

import java.util.Objects;

public abstract class Client {

	protected int id;
	protected String name;
	public float balance;
	private Account[] accounts = new Account[5];
	protected float commissionRate = 0; // עמלה תעריף
	protected float interestRate = 0; // ריבית
	public Logger logger;

	// constructor
	public Client(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		// instantiates the logger
		this.logger = new Logger(null);
	}

	public void addAccount(Account account) {

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;

				// log the operation
				long timestamp = System.currentTimeMillis();
				int clientId = this.id;
				String description = "Account added (id:" + account.getId() + ")";
				float amount = account.getBalance();
				Log log = new Log(timestamp, clientId, description, amount);
				logger.log(log);
				return;
			}
		}
	}

	public Account getAccount(int id) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getId() == id) {
				return accounts[i];
			}
		}
		return null;
	}

	public void removeAccount(int id) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getId() == id) {
				Account accountToRemove = accounts[i];
				accounts[i] = null;
				// transfers the money to the client balance
				this.balance += accountToRemove.getBalance();
				// log the operation
				long timestamp = System.currentTimeMillis();
				int clientId = this.id;
				String description = "the account has been removed and the balance has been transfered to the client's balance.";
				float amount = accountToRemove.getBalance();
				Log log = new Log(timestamp, clientId, description, amount);
				logger.log(log);
				return;
			}
		}
	}

	public void deposit(float amount) {
		float commission = amount * this.commissionRate;
		this.balance += amount;
		this.balance -= commission;
		Bank clientBank = Bank.getInstance();
		clientBank.addCommission(commission);
		// log the operation
		Log logDeposit = new Log(this.id, "deposit", amount);
		Log logCommission = new Log(this.id, "commission", commission);
		logger.log(logDeposit);
		logger.log(logCommission);
	}

	public void withdraw(float amount) {
		float commission = amount * this.commissionRate;
		this.balance -= amount;
		this.balance -= commission;
		Bank clientBank = Bank.getInstance();
		clientBank.addCommission(commission);
		// log the operation
		Log logWithdraw = new Log(this.id, "withdraw", amount);
		Log logCommission = new Log(this.id, "commission", commission);
		logger.log(logWithdraw);
		logger.log(logCommission);
	}

	public void autoUpdateAccounts() {
		for (Account account : accounts) {
			if (account != null) {
				float interest = account.getBalance() * this.interestRate;
				account.setBalance(account.getBalance() + interest);
				// log the operation
				Log log = new Log(this.id, "Auto update accounts for interest", interest);
				logger.log(log);
			}
		}
	}

	public float getFortune() {
		float fortune = this.balance;
		for (Account account : accounts) {
			if (account != null) {
				fortune += account.getBalance();
			}
		}
		return fortune;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getBalance() {
		return balance;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Client)) {
			return false;
		}
		Client other = (Client) obj;
		return id == other.id;
	}
	
	

}
