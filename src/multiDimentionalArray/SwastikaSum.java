package multiDimentionalArray;

import java.util.Scanner;

public class SwastikaSum {

	public static void main(String[] args) {
		 
		int[][] mat = getMat();
		
		swastikaSum(mat);
		
	}

	
	
	private static void swastikaSum(int[][] mat) {
		 
		int sum1=0,sum2=0;
		int M= mat.length;
		int N=mat[0].length;
		int mid=N/2;
		
		for(int i=0;i<=mid;i++)
			sum1+=mat[i][0];
		
		for(int j=0;j<M;j++) {
			sum1+=mat[mid][j];
		}
		
		for(int i=mid;i<N;i++)
			sum1+= mat[i][M-1];
		
		for(int j=0;j<=mid;j++)
			sum2+=mat[N-1][j];
		
		for(int i=0;i<N;i++) {
			sum2+=mat[i][mid];
		}
		
		for(int j=mid;j<M;j++)
			sum2+= mat[mid][j];
		
		System.out.println("1="+sum1+"2="+sum2+Math.abs(sum1-sum2));
		
	}



	private static int[][] getMat() {
		
		Scanner sc = new Scanner(System.in);
		int N,M;
		
		System.out.println("Eneter Row:");
		N=sc.nextInt();
		
		System.out.println("Enter coloum:");
		M= sc.nextInt();
		
		int[][] mat= new int[N][M];
		System.out.println("Eneter Elements:");
		
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++)
				mat[i][j]=sc.nextInt();
		
		sc.close();
		
		return mat;
	}

}
