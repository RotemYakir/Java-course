package app.core;

public class GoldClient extends Client {


	public GoldClient(int id, String name, float balance) {
		super(id, name, balance);
		this.interestRate = 0.003F; // ריבית
		this.commissionRate = 0.02F; // עמלה תעריף

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
		return "GoldClient [id=" + id + ", name=" + name + ", balance=" + balance +"]";
	}

	
	
}
