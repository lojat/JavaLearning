package collectionEx;
import java.util.ArrayList;

//Task: Remove first and last elements from the String arrayList

public class arrayListDemo01 {

	public static void main(String[] args) {
		// declare string ArrayList
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//add elements
		arrayList.add("Akash");
		arrayList.add("ashish");
		arrayList.add("manish");
		arrayList.add("sanjeet");
		arrayList.add("sanjay");
		arrayList.add("dinesh");
		arrayList.add("rohit");
		arrayList.add("pawan");
		
		//before removing
		System.out.println("Before removing:");
		for(String s: arrayList) {
			System.out.println(s);
		}
		
		//remove first elements
		arrayList.remove(0);
		//remove last elements
		arrayList.remove(arrayList.size()-1);
		
		//after removing
		System.out.println("\nafter removing:");
		for(String s:arrayList) {
			System.out.println(s+" ");
		}
		
		
	}
	
}
