package iChat;

//
//Write a Java program to print the sum of the digits of a number until the result is a single digit.
//Example
//Suppose, 38154 is a number for which we have to find the sum until it becomes a single-digit number.
//3 + 8 + 1 + 5 + 4 = 21
//
//Further, we will add 2 and 1.
//2 + 1 = 3
//
//We get 3 as a single-digit number


import java.util.Scanner;

public class JavaBasicDigitSum {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = sum(n);
		System.out.println(res);
		
		sc.close();
		
	}

	private static int sum(int n) { 
		int res=0;
		if(n<10) {
			return n;
		}
		else {
			while(n!=0) {
				res+=n%10;
				n=n/10;
			}
			if(res<10) {
				return res;
			}
			else {
				return sum(res);
			}
		}
	}

}
