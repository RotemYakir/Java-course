package app.core;

public class Bank {

	Client clients[];
	private float balance;
	Object accountUpdater;
	private Logger logger;

	
	//SINGLETON
	private Bank() {
		this.clients = new Client[100];
		this.logger = new Logger(null);
	}	
	private static Bank instance =new Bank();

	public static Bank getInstance() {
			return instance;
		}
			
	
	public float getBalance() {
		return balance;
	}

	public float getTotalFortune() {
		float totalFortune = this.balance;
		for (Client client : clients) {
			if (client != null) {
				totalFortune += (float) client.getFortune();
			}
		}
		return totalFortune;
	}

	public void addClient(Client client) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] == null) {
				clients[i] = client;
				Log log = new Log(client.getId(), "client added (id:" + client.getId() + ")", client.getFortune());
				logger.log(log);
				return;
			}
		}
	}

	public void removeClient(int clientId) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null && clients[i].getId() == clientId) {
				Client clientToRemove = clients[i];
				clients[i] = null;
				Log log = new Log(clientToRemove.getId(), "this client has been removed", clientToRemove.getFortune());
				logger.log(log);
				return;

			}
		}
	}

	public Client getClient(int id) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null && clients[i].getId() == id) {
				Client client = clients[i];
				return client;
			}
		}
		return null;
	}

	public Client[] getClients() {
		Client[] clientsToReturn = new Client[this.clients.length];
		int nextIndex = 0;
		for (Client client : this.clients) {
			if (client != null) {
				clientsToReturn[nextIndex] = client;
				nextIndex++;
			}
		}
		
		// fixing the length of the clientsToReturn array
		Client tempArr[] = new Client[nextIndex];
		System.arraycopy(clientsToReturn, 0, tempArr, 0, nextIndex);
		clientsToReturn = tempArr;
		return clientsToReturn;
	}
	
	// prints the client details 
	public void printClientList() {
		
	}
	
	// allow clients to transfer commissions to bank
	public void addCommission(float commission) {
		this.balance+=commission;
	}

	public void viewLogs() {
		System.out.println("not yet supported");
	}

	public void startAccountUpdater() {
		System.out.println("not yet supported");
	}
	
	

}
