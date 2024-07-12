package labs;

import java.util.ArrayList;

public class Lab9 {

	public static void main(String[] args) {
		// create an ArrayList of integers
		ArrayList<Integer> arrLst = new ArrayList<Integer>();
		
		//add the following elements to it: 10, 20, 30, 40, 50
		arrLst.add(10);
		arrLst.add(20);
		arrLst.add(30);
		arrLst.add(70);
		arrLst.add(50);
		
		//Print the original ArrayList.
		System.out.println("Original Array: ");
		for(int i: arrLst) {
			System.out.println(i+" ");
		}
		
		
		//Sort the ArrayList in ascending order.
		arrLst.sort(null);
		
		//Print the sorted ArrayList
		System.out.println("Sorted Array: ");
		for(int i: arrLst) {
			System.out.println(i+" ");
		}
		
		//Print the reversed ArrayList.
		System.out.println("Reverse Array: ");
		for(int i=arrLst.size()-1;i>=0;i--) {
			System.out.println(arrLst.get(i));
		}
	}
}
