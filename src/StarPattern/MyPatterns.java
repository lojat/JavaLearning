package StarPattern;
import java.util.Scanner;

public class MyPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of lines");
		int n= sc.nextInt();
		sc.close();
		pattern07(n);
//		pattern02(n);
	}
	
	static void  pattern00(int n) {
		/*
		 
		 *****
		 *****
		 *****
		 *****
		 *****
		 
		 */
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				System.out.print("*");
			System.out.println();
		}
	
				
	}
	static void pattern01(int n){
		/*
		 
		 *
		 **
		 ***
		 ****
		 .
		 .
		 .
		 
		 */
		
		String s="";
		for(int i=0;i<n;i++) {
			s=s+"*";
			System.out.println(s);
		}
		System.out.println();
	}
	
	static void pattern02(int n) {
		/*
		 
		 *****
		 ****
		 ***
		 **
		 *
		 
		 */
		
		for(int i=n;i>0;i--) {
			for(int j=i;j>0;j--)
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void pattern03(int n) {
		/* 
		 
		 *
		 **
		 ***
		 **
		 *
		 
		 */
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
	static void pattern05(int n){
		/*
		 
		      *
		     **
		    ***
		   ****
		 
		 */
		System.out.println("05");
		
		for(int i=n;i>0;i--) {
			for(int j=0;j<n;j++)
				if(j<i-1)
					System.out.print(" ");
				else
					System.out.print("*");
			System.out.println();
		}
		
	}
	
	static void pattern06(int n) {
		/*
		    *****
		    ****
		    ***
		    **
		    *
		 */
		
		System.out.println("06");
		
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--)
				System.out.print("*");
			System.out.println();
		}
	}
	
	
	static void pattern07(int n) {
		
		/*
		 
		     *
		    ***
		   *****
		  *******
		 
		 */
		
		System.out.println("07");
		
		String st="*";
		for(int i=0;i<n;i++) {
			for(int j=n;j>=i;j--) {
				if(j==i) {
					System.out.println(st);
					continue;
				}
				else
					System.out.print(" ");
			}
//			System.out.println();
			st+="**";
		}		
	}
	
	
}
