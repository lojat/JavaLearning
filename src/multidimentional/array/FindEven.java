package multidimentional.array;

public class FindEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{2,7,3},{4,8,5}, {0,6,8}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
				if(arr[i][j]%2==0)
					System.out.print(arr[i][j]+" ");
			System.out.println();
	}
	}
}
