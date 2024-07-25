package collection.ex;

import java.util.ArrayList;

public class ArrayListDemo04 {

	public static void main(String[] args) {
		 
		ArrayList<Integer> arrLst = new ArrayList<Integer>();
		
		arrLst.add(10);
		arrLst.add(20);
		arrLst.add(30);
		arrLst.add(70);
		arrLst.add(50);
		
		System.out.println("Original Array: ");
		for(int i: arrLst) {
			System.out.println(i+" ");
		}
		
		arrLst.sort(null);
		
		System.out.println("Sorted Array: ");
		for(int i: arrLst) {
			System.out.println(i+" ");
		}
		
		System.out.println("Reverse Array: ");
		for(int i=arrLst.size()-1;i>=0;i--) {
			System.out.println(arrLst.get(i));
		}
	}

}
