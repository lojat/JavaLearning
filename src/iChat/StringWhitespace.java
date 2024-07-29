package ichat;

//How do you remove leading and trailing whitespace from a string in Java?

public class StringWhitespace {

	public static void main(String[] args) {
		 
		String str1= " Hello Java!  ";
		
		String trimStr1 = str1.trim();//trim method remove all leading and trailing space and return new string
		
		String str2 ="    Hello world!   ";
		
		String leadingStr2 = str2.stripLeading();//stripLeading method remove all leading space and return new string
		String trailingStr2 = str2.stripTrailing();//stripTrailing method remove all trailing space and return new string
		String stripStr2 = str2.strip();//strip method remove all leading and trailing space and return new string
		
		System.out.println("["+str1+"]"+" remove all white space by trim methode: "+trimStr1);
		System.out.println("["+str2+"]"+" remove all white space by strip methode: "+stripStr2);
		System.out.println("["+str2+"]"+" remove all Leading white space by stripLeading methode: "+leadingStr2);
		System.out.println("["+str2+"]"+" remove all Trailing white space by stripTrailing methode: "+trailingStr2);

	}

}
