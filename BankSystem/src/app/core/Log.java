package app.core;

public class Log {

	private long timestamp;
	private int clientId;
	private String description;
	private float amount;

	//creates log for specified time
	public Log(long timestamp, int clientId, String description, float amount) {
		super();
		this.timestamp = timestamp;
		this.clientId = clientId;
		this.description = description;
		this.amount = amount;
	}

	// creates a log for current time
	public Log(int clientId, String description, float amount) {
		this(System.currentTimeMillis(), clientId, description, amount);
	}

	
	 
	public String tostring() {
		return "Log [timestamp=" + timestamp + ", clientId=" + clientId + ", description=" + description + ", amount="
				+ amount + "]";

	}

}