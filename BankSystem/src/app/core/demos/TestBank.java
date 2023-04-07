package app.core.demos;



import app.core.Account;
import app.core.Bank;
import app.core.Client;

public class TestBank {

	public static void main(String[] args) {

		Bank bank = Bank.getInstance();
		bank.addClient(new Client(101, "aaa", 500));
		bank.addClient(new Client(102, "bbb", 200));
		bank.addClient(new Client(103, "ccc", 300));

		Client client102 = bank.getClient(102);
		if (client102 != null) {

			client102.deposit(1000);
			client102.addAccount(new Account(201, 20000));
			client102.addAccount(new Account(202, 30000));
		} else {
			System.out.println("client with this id not found");
		}

		System.out.println("bank balance: " + bank.getBalance());
		System.out.println("bank fortune: " + bank.getTotalFortune());

		System.out.println("the bank clients: ");
		for (Client currClient : bank.getClients()) {
			System.out.println(currClient.getName());
		}

	}

}
