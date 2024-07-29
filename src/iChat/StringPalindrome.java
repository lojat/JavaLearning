package ichat;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		//taking input from user 
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		//calling method to check is given string is palindrome or not
		boolean res = isPallindrome(str);
		
		System.out.println(res);

		sc.close();
	}
	
	//method to check given string is  palindrome 
	public static boolean isPallindrome(String str) {
		boolean res=true;		
		
		for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)){
				res = false;
				break;
			}
		}
		
		return res;
	}

}
