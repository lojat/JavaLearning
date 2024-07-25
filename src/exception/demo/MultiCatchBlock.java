package exception.demo;

import java.util.Scanner;

public class MultiCatchBlock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length of Array:");
		int len = sc.nextInt();

		int arr[] = new int[len];
		System.out.println("Enter Elements:");

		for (int i = 0; i < len; i++)
			arr[i] = sc.nextInt();
		
		try {
//			int j= arr[len-2]/0;
//			int k = arr[len];
			int x= Integer.parseInt("394k");
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}catch( Exception e) {
			System.out.println("Parent Exception: "+e);
		}finally {
			System.out.println("End!");
		}

	}

}
