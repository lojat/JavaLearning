package multiDimentionalArray;

import java.util.Scanner;

public class DiamandArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}}; // o/p - 7 4 1 5 9 6 3 
//		int[][] arr = { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 }, { 41, 42, 43, 44, 45 },
//				{ 51, 52, 53, 54, 55 } };// o/p - 51 41 31 21 11 22 33 44 55 45 35 25 15 
//		
//		int[][] arr = { { 11, 12, 13, 14, 15,16,17 }, { 21, 22, 23, 24, 25,26,27 }, { 31, 32, 33, 34, 35,36,37 }, { 41, 42, 43, 44, 45 ,46,47},
//				{ 51, 52, 53, 54, 55,56,57 },{61,62,63,64,65,66,67},{71,72,73,74,75,76,77} };// o/p - 51 41 31 21 11 22 33 44 55 45 35 25 15 
		
		
		Scanner sc = new Scanner(System.in);
		int n=arr.length;
		 
//		System.out.println("Eneter number of Elements: ");
//		n=sc.nextInt();
//		
//		int[][] arr=new int[n][n];
//		
//		System.out.println("Enter elements:");
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++)
//				arr[i][j]=sc.nextInt();
//		}	
//		
		display(n,arr);
		
		sc.close();
		
	}

	private static void display(int n, int[][] arr) {
		 System.out.println("n"+n/2);
		
		 int j=n-1;
		
		for(int i=(n/2);i>=0;i--)
			System.out.print(arr[i][j--]+" ");
		
		j=(n/2)-1;
		for(int i=1;i<=(n/2);i++) 
			System.out.print(arr[i][j--]+" ");
		
		j=1;
		for(int i=(n/2)+1;i<n;i++)
			System.out.print(arr[i][j++]+" ");
		
		j=(n/2)+1;
		for(int i=n-2;i>n/2;i--)
			System.out.print(arr[i][j++]+" ");

	}

}
