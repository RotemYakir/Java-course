package app.core.beans;

import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Counter extends Thread {

	private int count = 1;
	private boolean active=true;

	
	@Override
	public void run() {
		while (active) {
			System.out.println(count++);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@PostConstruct
	public void startCounter() {
		this.start();
	}
	
	@PreDestroy
	public void stopCounter() {
		active=false;
	}

}
