package ichat;

//Write a function to replace all spaces in a sentence with @. All continuous spaces 
//should be replaced with only one @. Example: There are   3   spaces. Should become: There@are@3@spaces



import java.util.Scanner;

public class OopsReplaceSpace {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 String sentence="";
		 
		 try {
			 sentence= sc.nextLine();
		 }catch(Exception e) {
			 System.out.println(e);
		 }
		 
		 String resSentence = sentence.replaceAll("\\s+", "@");;
		 
		 System.out.println(resSentence);
		 
		 sc.close();
	}

}
