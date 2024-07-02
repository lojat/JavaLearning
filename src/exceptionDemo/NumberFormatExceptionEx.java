package exceptionDemo;

import java.util.Scanner;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		String s = sc.next();
		
		int num =0;
		
		try {
			num= Integer.parseInt(s);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}

		System.out.println("Number: "+num+" End!");
		
		sc.close();
	}

}
