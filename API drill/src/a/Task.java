package a;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task implements Comparable <Task>{

	private final int id;
	private static int nextId = 1;
	private String description;
	private boolean done;
	private LocalDateTime deadline;
	private boolean alertPopped;
	
	
	
	public Task(int id) {
		super();
		this.id = id;
	}

	public Task(String description, LocalDateTime deadline) {
		super();
		this.description = description;
		this.deadline = deadline;
		this.id=nextId++;
		this.done=false;
		this.alertPopped=false;
	}
	
	public Task() {
		this.id = nextId++;
		// TODO Auto-generated constructor stub
	}

	public void doTask() {
		this.done=true;
	}



	

	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + ", done=" + done + ", deadline=" + deadline
				+ ", alertPopped=" + alertPopped + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public LocalDateTime getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDateTime deadline) {
		this.deadline = deadline;
	}

	public boolean isAlertPopped() {
		return alertPopped;
	}

	public void setAlertPopped(boolean alertPopped) {
		this.alertPopped = alertPopped;
	}

	public int getId() {
		return id;
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
		if (!(obj instanceof Task)) {
			return false;
		}
		Task other = (Task) obj;
		return id == other.id;
	}
	


	@Override
	public int compareTo(Task other) {
		return this.deadline.compareTo(other.deadline);	
	}

}
