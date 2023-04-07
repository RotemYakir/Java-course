package app.core;

public class RegularClient extends Client {

		
	public RegularClient(int id, String name, float balance) {
		super(id, name, balance);
		this.commissionRate = 0.03F; // עמלה תעריף
		this.interestRate = 0.001F ; // ריבית
	}

	@Override
	public void withdraw(float amount) {
		float commission = amount * commissionRate;
		super.balance -= amount;
		super.balance -= commission;
		Bank clientBank = Bank.getInstance();
		clientBank.addCommission(commission);
		// log the operation
		Log logWithdraw = new Log(super.id, "withdraw", amount);
		Log logCommission = new Log(super.id, "commission", commission);
		logger.log(logWithdraw);
		logger.log(logCommission);
	}

	@Override
	public String toString() {
		return "RegularClient [id=" + id + ", name=" + name + ", balance=" + balance +  "]";
	}
	
	
}
