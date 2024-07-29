package ichat;

public class StringAndStringBuffer {

	public static void main(String[] args) {
		 
		String string = "Hello";//creating string object
		string= string+" Java";//String concatenate with "java" here new string object are created 
		string= string+"!";// here also new object created 
		
		System.out.println(string);
		
		StringBuffer stringBuffer = new StringBuffer("Hello");//creating string Buffer object
		stringBuffer.append(" java");//here we add java string in stringBuffer 
		stringBuffer.append("!");//here also we add in old string buffer object
		
		System.out.println(stringBuffer);
	}

}
