package list;

import java.util.LinkedList;
import java.util.List;

public class Tar1 {

	public static void main(String[] args) {

	List <Integer> list= new LinkedList<>();
	
	list.add(165);
	list.add(25);
	list.add(82);
		
	System.out.println(list);
	System.out.println("the third element is: " + list.get(2));
	
	int sum=0;
	for (int i = 0; i < list.size(); i++) {
		sum+=list.get(i);
	}
	
	System.out.println("the sum of all the elements is: "+ sum);
	System.out.println("the average of all the elements is: " + (double)sum/list.size() );
	
	}

}
