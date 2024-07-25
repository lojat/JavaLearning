package collection.ex;

import java.util.LinkedHashSet;

public class linkedHashSetDemo {

	public static void main(String[] args) {
		 
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		set.add(23);
		set.add(24);
		set.add(23);
		 
		for(int i: set) {
			System.out.println(i);
		}
		
		
	}

}
