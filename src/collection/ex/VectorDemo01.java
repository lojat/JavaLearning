package collection.ex;

import java.util.Vector;

public class VectorDemo01 {

	public static void main(String[] args) {
		//Vector of integers
		Vector<Integer> vector = new Vector<Integer>(); 
		
		// add the following elements to it: 10, 20, 30, 40, 50
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		
		//Print the original Vector
		System.out.println("Original Vector: ");
		for(int i: vector) {
			System.out.println(i+" ");
		}
		
		//Remove the element at index 2 (30).
		vector.remove(2);
		
		//Add a new element 35 at index 2.
		vector.add(2,30);
		
		//Print the modified Vector.
		System.out.println("Modified Vector: ");
		for(int i: vector) {
			System.out.println(i+" ");
		}
		
		//Check if the Vector contains the element 40.
		System.out.print("The vector contains the element 40:");
		if(vector.contains(40))
			System.out.println("Yes ");
		else
			System.out.println("No");
		
		//Remove all elements from the Vector.
		vector.clear();
		
		//Print the final Vector
		System.out.println("final Vector: ");
		for(int i: vector) {
			System.out.println(i+" ");
		}
		
	}

}
