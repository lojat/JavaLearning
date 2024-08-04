package labs;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Lab16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer: ");
		
		int num;

		//Handle Exception if user input is not a Integer
		try {
			num = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println(e);
		} 
		
		System.out.println("End!");
	}

}
