package multiDimentionalArray;

public class NTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}}; // o/p - 7 4 1 5 9 6 3 
//		int[][] arr = { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 }, { 41, 42, 43, 44, 45 },
//				{ 51, 52, 53, 54, 55 } };// o/p - 51 41 31 21 11 22 33 44 55 45 35 25 15 
		int l=arr.length, count = 0;

		for (int i = 0; i < l; i++) {
			if (i == 0)
				for (int j = l - 1; j >= 0; j--,count++)
					System.out.print(arr[j][i] + " ");
			else if (i == l - 1)
				for (int j = l - 1; j >= 0; j--,count++)
					System.out.print(arr[j][i] + " ");
			else {
				System.out.print(arr[i][i]+" ");
			}
		}
		System.out.println("\n"+count);

	}
}