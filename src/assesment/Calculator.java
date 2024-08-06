package assesment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	
	Scanner sc = new Scanner(System.in);
	
	int a = 0;
	int b = 0;

	public void perFormOperation() {
	
		 
		while(true) {
			
			int operation = getOperation();
			
			switch (operation) {

				case 1:
					getValue();
					System.out.println(a + "  + " + b + " = " + (a+b));
					break;
	
				case 2:
					getValue();
					System.out.println(a + " -  " + b + " = " + (a-b));
					break;
	
				case 3:
					getValue();
					System.out.println(a + " *  " + b + " = " + (a*b));
					break;
				case 4:
					getValue();
					try {
						System.out.println(a + " /  " + b + " = " + (a/b));
					}catch(ArithmeticException e ) {
						System.out.println(e+"\n");
					}
					break;
				
				case 5: 
					System.out.println("!End");
					System.exit(0);	
				
				default: System.out.println("Enter valid operation");
			}
		}
	}
	
	private void getValue() {

		System.out.println("Enter two values: ");
		
		try {
			a = sc.nextInt();
			b = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
	}

	private int getOperation() {

		System.out.println("Choice operation: ");

		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplicaion");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		
		int operation = 5;
		
		try {
			operation = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
		
		return operation;
	}

	
}
