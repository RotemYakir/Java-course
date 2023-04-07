package reviewANDdrills;


		public class TestStopThread {

			public static void main(String[] args) throws InterruptedException {
				
				MyStopThread t1 = new MyStopThread("t1");
				
				t1.start();
				Thread.sleep(5);
				t1.interrupt();
				

			}

		}