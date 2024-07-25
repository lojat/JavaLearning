package collection.ex;

import java.util.ArrayList;

//Write a Java program to create an ArrayList of 
//strings, add the following elements to it: "Apple", 
//"Banana", "Cherry", "Date", "Elderberry". Then,
//perform the following operations:
////
//Print the original ArrayList.
//Remove the element at index 2 (Cherry).
//Add a new element "Fig" at index 2.
//Print the modified ArrayList.
//Check if the ArrayList contains the element "Banana".
//Remove all elements from the ArrayList.
//Print the final ArrayList.
public class arrayListDemo02 {
	
	public static void main(String[] args) {
		 
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");
		fruits.add("Elderberry");
		fruits.add("Then");
		
		//Print the original ArrayList.
		System.out.println("The original ArrayList:");
		for(String fruit: fruits) {
			System.out.print(fruit+" ,");
		}
		
		//Remove the element at index 2 (Cherry).
		fruits.remove(2);
		//Add a new element "Fig" at index 2.
		fruits.add(2,"Fig");
		
		//Print the modified ArrayList.
		System.out.println("\nThe modified ArrayList:");
		for(String fruit: fruits) {
			System.out.print(fruit+" ,");
		}
		
		//Check if the ArrayList contains the element "Banana".
		System.out.print("\nFruits contain Banana: ");
		if(fruits.contains("Banana"))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		//Remove all elements from the ArrayList.
		fruits.clear();
		
		//Print the final ArrayList.
		System.out.println("\nThe final ArrayList");
		for(String fruit: fruits) {
			System.out.print(fruit);
		}
		

	}

}
