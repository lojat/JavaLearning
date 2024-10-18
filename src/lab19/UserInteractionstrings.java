package lab19;

import java.util.Scanner;

public class UserInteractionstrings {
	
	private Scanner sc = new Scanner(System.in);
	private String str;

	//method to get string from user
	public void setStr(){
		System.out.println("Enter String: ");
		this.str = sc.nextLine();
	}
	
	
	// method to return string
	public String getStr() {
		return str;
	}
 	
	// method to manipulate string to upper acse
	public String upperCase(String str) {
		
		ManipulateStringInteface upperCaseStr = (String s) -> {return str.toUpperCase();} ;// convert string in upper case with lambda expression
		
		return upperCaseStr.manipulate(str);
		
	}
	
	
	//method for lower case
	public String lowerCase(String str) {
		
		ManipulateStringInteface lowerCaseStr = (String s) -> {return str.toLowerCase();} ;// convert string in upper case with lambda expression
		
		return lowerCaseStr.manipulate(str);
		
	}
	
	
	//method for reverse
	public String reverse(String str) {
		
		ManipulateStringInteface reverse = (String s) -> {// convert string in upper case with lambda expression
			
			String res = "";
			for(int i = 0 ; i < s.length() ; i++ ) {
				res += str.charAt(s.length()-i-1) ;
			}

			return res;
		} ;	
		
		return reverse.manipulate(str);
		
	}
						
	
}
