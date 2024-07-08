package collectionEx;

import java.util.Vector;

public class VectorDemo01 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>(); 
		
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		
		System.out.println("Original Vector: ");
		for(int i: vector) {
			System.out.println(i+" ");
		}
		
		vector.remove(2);
		
		vector.add(2,30);
		
		System.out.println("Modified Vector: ");
		for(int i: vector) {
			System.out.println(i+" ");
		}
		
		if(vector.contains(40))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		vector.clear();
		
		System.out.println("final Vector: ");
		for(int i: vector) {
			System.out.println(i+" ");
		}
		
	}

}
