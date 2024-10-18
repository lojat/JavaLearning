package lab19;

public class ManipulateStrings {

	public static void main(String[] args) {
		 
		UserInteractionstrings user = new UserInteractionstrings();
		
		user.setStr();//get string from user 
		
		String str = user.getStr();
		
		System.out.println(str+ " UpperCase: "+user.upperCase(str));//calling upper case method
		System.out.println(str+" LowerCase: "+user.lowerCase(str));// calling lower case method
		System.out.println(str+" Reverse: "+user.reverse(str));//calling reverse method
		
	}

}
