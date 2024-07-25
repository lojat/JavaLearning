package collection.ex;

import java.util.ArrayList;
import java.util.Vector;

// vector is similar as arraylist but its thread safe 
public class VectorDemo {

	public static void main(String[] args) {
		// declare vector 
		Vector<String> vector = new Vector<String>();

		// add elements 
		vector.add("Mango");
		vector.add("Papaya");
		vector.add("stoberry");

		// declare arraylist
		ArrayList<String> arrayList = new ArrayList<String>();

		// add elements
		arrayList.add("banana");
		arrayList.add("cherry");
		arrayList.add("fig");
		 
		//display vector elements
		System.out.println("Vector elemts before add fruits ArrayList: ");
		for (String v : vector)
			System.out.print(v + ",");

		//adding all elements of arraylist to vector 
		System.out.println(vector.addAll(arrayList));

		//displaying final vector
		System.out.println("\nAfter adding all fruits arrayList:");
		for (String v : vector)
			System.out.print(v + ",");

	}

}
