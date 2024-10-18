package labs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lab17 {

	public static void main(String[] args) {
		 
		List<String> list = new ArrayList<String>();// list object
		
		
		//adding some data to list
		list.add("hello");
		list.add("java");
		list.add("welcome");
		list.add("hello");
		list.add("hello");
		list.add("stream");
		list.add("java");
		
		//new set of distinct string 
		Set<String> distinictString = list.stream().collect(Collectors.toSet());
		
		System.out.println(distinictString);
	}
}
