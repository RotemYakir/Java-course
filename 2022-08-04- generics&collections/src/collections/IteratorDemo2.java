package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IteratorDemo2 {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();
		set.add("aaa");
		set.add("bbbbbbbb");
		set.add("ccc");
		set.add("dddddd");
		set.add("eee");
		
			Iterator <String> it= set.iterator();
			while(it.hasNext()) {
				String curr = it.next();
				System.out.println(curr);
				if(curr.length()>3) {
					it.remove();
				}
			}
			System.out.println(set);
			
		}

	}


