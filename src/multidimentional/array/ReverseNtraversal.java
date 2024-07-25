package multidimentional.array;

public class ReverseNtraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}}; // o/p - 1 4 7 5 3 6 9   
		int[][] arr = { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 }, { 41, 42, 43, 44, 45 },
				{ 51, 52, 53, 54, 55 } };// o/p - 11 21 31 41 51 42 33 24 15 25 35 45 55
		int l = arr.length, count = l - 1;

		for (int j = 0; j < l; j++)
			System.out.print(arr[j][0] + " ");

		for (int i = 1; i < l - 1; i++) {
			count--;
			System.out.print(arr[count][i] + " ");

		}

		for (int j = 0; j < l; j++)
			System.out.print(arr[j][l - 1] + " ");

	}
}
