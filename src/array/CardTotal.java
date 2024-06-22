package array;

import java.util.Scanner;

public class CardTotal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N=0;
		System.out.println("Enter Number of Elements:");
		N=sc.nextInt();
		
		int[] price = new int[N],qty = new int[N];
		
		System.out.println("Enter the prices:");
		for(int i=0;i<N;i++)
			price[i]=sc.nextInt();
		
		System.out.println("Enter quantities:");
		for(int i=0;i<N;i++)
			qty[i]=sc.nextInt();
		
		cardTotal(N,price,qty);
		
		sc.close();
	}

	private static void cardTotal(int N, int[] price, int[] qty) {
	 
		int sum=0;
		
		for(int i=0;i<N;i++) {
			sum+=(price[i]*qty[i]);
		}
		
		System.out.println(sum);
		
	}

}
