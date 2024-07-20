package iChat;

import java.util.Scanner;

public class OopsStringConcate {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String string1= sc.next();
		String string2= sc.next();
		sc.close();
		String res= concatenateAndReverse(string1,string2);
		System.out.println(res);
	}
	//Method To Concatenate of Three Letters from both string and reverse
	private static String concatenateAndReverse(String string1, String string2) {
		
		String res = string1.substring(0, 3)+string2.substring(0, 3);
		String res1="";
		for(int i= res.length()-1;i>=0;i--) {
			res1+=res.charAt(i);
		}
		
		return res1;
	}

}
