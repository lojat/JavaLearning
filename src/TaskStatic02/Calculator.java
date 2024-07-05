package taskStatic02;

public class Calculator {
	
	static int num1,num2;
	
	static {
		num1 = 16;
		num2= 19;
	}
	
	public static void main(String[]args) {
		
		System.out.println("Num1 = "+num1+" Num2 = "+num2);
		
		
	}

}
