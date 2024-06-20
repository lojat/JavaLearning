package multiDimentionalArray;

//reverse array traversal
public class ReverseTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,8,9},{2,7,10},{3,6,11},{4,5,12}};
		 
		
		int r=4, c=3;
		
		System.out.println("Before ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		System.out.println("After");
		
		for(int i=c-1;i>=0;i--) {
			for(int j=0;j<r;j++) {	
				 System.out.print(arr[j][i]+" ");
			}
//			System.out.println();
		}
		
		 
	}

}
