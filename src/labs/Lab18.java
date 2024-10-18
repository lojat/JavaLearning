package labs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lab18 {

	public static void main(String[] args) {
		 
		 
		List<String> list = new ArrayList<String>();
		
		//adding some data to list
		list.add("hello");
		list.add("java");
		list.add("welcome");
		list.add("hello");
		list.add("hello");
		list.add("stream");
		list.add("java");
		
		// concate all string in string variable
		String concateList = list.stream().collect(Collectors.joining());
		
		System.out.println(concateList);

	}
	
}
