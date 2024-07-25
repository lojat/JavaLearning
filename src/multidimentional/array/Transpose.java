package multidimentional.array;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{0,0,0,0},{1,1,1,1},{2,2,2,2}};
		int[][] arr1 = new int[4][3];
		int r=3, c=4;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr1[j][i]=arr[i][j];
			}
		}
		
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
