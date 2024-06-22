package array;

import java.util.Scanner;

public class Countdigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Enter Number of elements :");
		num = sc.nextInt();

		int[] arr = new int[num];
		System.out.println("Enter elements");

		for (int i = 0; i < num; i++)
			arr[i] = sc.nextInt();

		int[] arr1 = new int[3];

		for (int i = 0; i < num; i++) {
			if (arr[i] == 0)
				arr1[0]++;
			else if (arr[i] == 1)
				arr1[1]++;
			else if (arr[i] == 2)
				arr1[2]++;
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		sc.close();
	}

}
