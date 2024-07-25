package multidimentional.array;

public class Circular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr = { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 }, { 41, 42, 43, 44, 45 },
				{ 51, 52, 53, 54, 55 } };
		int l = arr.length;
		

		for(int j=l-1;j>=0;j--)
			System.out.print(arr[j][0]+" ");
 
 
		for(int j=1;j<l;j++)
			System.out.print(arr[0][j]+" ");
 
	 
		for(int j=1;j<l;j++)
			System.out.print(arr[j][l-1]+" ");
 
		for(int j=l-2;j>0;j--)
			System.out.print(arr[l-1][j]+" ");
	}

}
