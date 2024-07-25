package multidimentional.array;

public class RectangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length+1;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}

}
