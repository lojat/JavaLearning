package lab15;

import java.util.Scanner;

public class Matrix {

	// method to get elements for matrix
	public Integer[][] getMatrix(int raw, int column) {
		
		Scanner sc = new Scanner(System.in);

		Integer[][] matrix = new Integer[raw][column];

		System.out.println("Enter Elements: ");
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		return matrix;
	}

	// method to display matrix
	public void display(Integer[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	// method for perform addition of matrix
	public Integer[][] addMatrix(Integer[][] matrix1, Integer[][] matrix2) {

		// get raw and column
		int raw = matrix1.length;
		int column = matrix1[0].length;

		Integer[][] resMatrix = new Integer[raw][column];// res matrix

		// get same index elements of both matrix sum them and store in resMatrix
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				resMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		// return resmatrix
		return resMatrix;

	}

}
