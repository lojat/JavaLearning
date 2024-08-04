package lab15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
		
			//get raw and column for matrix
			System.out.println("Enter the row & column: ");
			int raw = sc.nextInt();
			int column = sc.nextInt();
			
			Matrix obj = new Matrix();
			
			//call method for get all elements for matrix 
			Integer[][] matrix1 = obj.getMatrix(raw,column);
			Integer[][] matrix2 = obj.getMatrix(raw,column);
				
			//calling method to perform addition of both matrix
			Integer[][] sumMatrix = obj.addMatrix(matrix1, matrix2);
				
			//display all matrix
			System.out.println("Matrix 1: ");
			obj.display(matrix1);
			System.out.println("Matrix 2: ");
			obj.display(matrix2);
			System.out.println("Addition of marix1 and matrix2: ");
			obj.display(sumMatrix);
			
	}

}
