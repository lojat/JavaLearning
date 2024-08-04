package lab14;

import java.util.Scanner;

public class SumAndAverage {

	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// take length of the array
		System.out.println("Enter the number of elements: ");
		int num = sc.nextInt();

		// get array elements with getNumber method
		int[] numbers = getNumbers(num);

		// get sum and average
		getSumAndAverage(numbers);

	}

	// method to get all elements
	public static int[] getNumbers(int num) {

		int[] numbers = new int[num];

		System.out.println("Enter Elements: ");
		for (int i = 0; i < num; i++) {
			numbers[i] = sc.nextInt();
		}

		return numbers;
	}

	// method to calculate and and average
	public static void getSumAndAverage(int[] numbers) {

		int sum = 0;
		double average = 0;
		int len = numbers.length;

		for (int i = 0; i < len; i++) {
			sum += numbers[i];
		}

		System.out.println("Sum : " + sum);

		average = sum / len;
		System.out.println("Average : " + average);
	}

}
