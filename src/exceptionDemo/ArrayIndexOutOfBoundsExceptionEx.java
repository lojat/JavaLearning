package exceptionDemo;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of Array:");
		int len= sc.nextInt();
		
		int arr[]= new int[len];
		System.out.println("Enter Elements:");
		
		for(int i=0;i<len;i++)
			arr[i] = sc.nextInt();
		
		try {
			System.out.println(arr[len]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		
		System.out.println("End!");
		
		sc.close();

	}

}
