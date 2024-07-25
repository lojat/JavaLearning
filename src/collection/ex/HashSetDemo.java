package collection.ex;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String [] args) {
		//declare hashset
		HashSet<String> hashSet = new HashSet<String>();
		
		//add elements
		hashSet.add(null);
		hashSet.add("");
		hashSet.add("");
		//hashset not allow multiple null value 
		hashSet.add(null);
		hashSet.add("hi");
		hashSet.add("hello");
		//hashset not store duplicate value
		hashSet.add("hello");
		
		for(String str: hashSet) {
			System.out.println(str);
		}
		
		System.out.println(hashSet.size());
	}
}
