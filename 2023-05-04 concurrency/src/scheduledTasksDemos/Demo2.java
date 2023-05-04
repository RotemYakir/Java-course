package scheduledTasksDemos;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {

		ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(1);

		Runnable task = () -> System.out.println("Task Finished");

		long initialDelay = 0;
		long period = 2;
		
		// starts a new task every 2 seconds
		scheduledExecutor.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);
		
//		// starts a new task 2 seconds after the current task is done
//		scheduledExecutor.scheduleWithFixedDelay(task, initialDelay, period, TimeUnit.SECONDS);

		TimeUnit.SECONDS.sleep(10);
		System.out.println("stopping the periodical task");
		scheduledExecutor.shutdown();
	}

}
