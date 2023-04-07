package lab3;

public class Number3 {

	public static void main(String[] args) {

		int year = (int)(Math.random()*2023);
		
		System.out.println(year);
		
	if ((year%4<=0 & year%100> 0)||year%400<=0) {
		System.out.println("leap year");
		
	}else { System.out.println("regular year");}
	
	
	
	
	}

}
