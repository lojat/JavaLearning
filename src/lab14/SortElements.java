
/*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
package lab14;

import java.util.Scanner;

public class SortElements {

	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// take length of the array
		System.out.println("Enter the number of elements: ");
		int num = sc.nextInt();

		// get array elements with getNumber method
		int[] numbers = getNumbers(num);

		// calling sorting method to sort all numbers
		int[] sortedNumbers = sortNumbers(numbers);

		display(sortedNumbers);

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

	// method to sort elements with insertion sort algorithm
	public static int[] sortNumbers(int[] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {

			for (int j = i; j < numbers.length; j++) {
				if (numbers[j] < numbers[i]) {// if previous element is greater then next then swap
					
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				 
				}
			}
		}
		 
		return numbers;
	}

	// method to display elements
	public static void display(int[] numbers) {

		System.out.print("Sorted numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "  ");
		}

	}

}
