package daemon;

public class Snooze  extends Thread{

	public Snooze(String name) {
		super(name);
	}

	public void run() {
		while(true) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Nu Kvar!!!");
		}
	}
	
	

}
