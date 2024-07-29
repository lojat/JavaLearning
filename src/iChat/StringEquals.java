package ichat;

public class StringEquals {

	public static void main(String[] args) {
		 
		//create string objects by new keyword
		String str1 = new String("hello");
		String str2= new String("hello");
		
		//comparing by equals and ==
		System.out.println("str1 is equals st2: "+str1.equals(str2));// here output is true because both contain same string
		System.out.println("str1 is == st2: "+ (str1==str2));// here output false because whenever we create object by new its create new object rather give reference of pre object

		//create string by string literal
		String str3 = "hello";
		String str4 ="hello";
		
		System.out.println("str3 is equals str4: "+str3.equals(str4));//here output is true because same contain
		System.out.println("str3 is == str4: "+(str3==str4));// here output is also true because whenever we create string object by string literal it check if  same string already exists in string pool it give reference of that string rather creating new string
		
		//create another string variable with different contains
		String str5="Hello";
		
		System.out.println("str3 is equals str5: "+str3.equals(str5));//here output is false because different contain
		System.out.println("str3 is == str5: "+(str3==str5));//here also false because different objects
	}

}
