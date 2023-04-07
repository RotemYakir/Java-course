package app.core.demos;

import app.core.Account;
import app.core.Client;

public class TestClient {

	public static void main(String[] args) {

		Client client = new Client(101, "Dan", 32904);

		// add account to Dan
		System.out.println("adding 3 accounts");
		client.addAccount(new Account(222, 3000));
		client.addAccount(new Account(333, 4500));
		client.addAccount(new Account(444, 2398));

		System.out.println("deposit 100");
		client.deposit(1_000);
		System.out.println("withdraw 100");
		client.deposit(100);
		System.out.println("auto update accounts");
		client.autoUpdateAccounts();

		System.out.println("client balance: " + client.getBalance());
		System.out.println("client fortune: " + client.getFortune());

	}

}
