package labs;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a:");
		int a = sc.nextInt();

		System.out.println("Enter b:");
		int b = sc.nextInt();

		try {
			int c = a / b;
			System.out.println("C: " + c);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		sc.close();

	}

}
