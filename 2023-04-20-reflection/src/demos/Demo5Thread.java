package demos;

import java.lang.reflect.Field;

public class Demo5Thread {
	
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			System.out.println("Hi");
		});
		
		
		t.start();
		
		// System.out.println(t.target);
		
		Class<Thread> threadClass = Thread.class;
		try {
			Field targetField = threadClass.getDeclaredField("target");
			targetField.setAccessible(true);
			System.out.println(targetField);
			
			Runnable r =  (Runnable) targetField.get(t);
			System.out.println(r);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}

}