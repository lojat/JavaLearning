package multiDimentionalArray;

import java.util.Scanner;

public class FindEle {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int n,sum;
		 
		System.out.println("Eneter number of Elements: ");
		n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}	
		
		System.out.println("Enetr sum:");
		sum=sc.nextInt();
		
		sc.close();
		
		find(n,sum,arr);//by two loop 
		find1(n,sum,arr);//by single loop
	}

	
	
	private static void find1(int n, int sum, int[] arr) {
		 
		int[] arr1 = new int[sum+1];
		int flag=0;
		
		System.out.println("Single loop: ");
		
		for(int i=0;i<n;i++) {
			if(arr[i]<=sum) {
				int def= sum-arr[i];
				if(arr1[def]!=0) {
					System.out.println(def+" "+arr[i]);
					flag=1;
				}
				else {
					arr1[arr[i]]=1;
				}
				
			}
		}
		if(flag == 0) {
			System.out.println("Not found");
		}
		
	}



	private static void find(int n, int sum, int[] arr) {
		 
		System.out.println("double loop: ");
		
		for ( int i = 0 ;i<n ;i++) {
			
			for ( int j = i+1  ;j<n ;j++) {
				
				if((arr[i]+arr[j]) == sum) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}
