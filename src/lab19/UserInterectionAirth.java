package lab19;

import java.util.Scanner;

public class UserInterectionAirth {

	private Scanner sc = new Scanner(System.in);
	private int num1 = 0;
	private int num2 = 0;
	
	
	//method to  get input from user 
	public void getNums(){
		System.out.println("Enter two numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	}
	
	// method to perform operation 
	public void performoperation(){
		
		
		// lambda expression to perform various arithmetic operation 
		AirthmeticOperation sum = (num1,num2) -> {return num1+num2;};
		AirthmeticOperation mul = (num1,num2) -> {return num1*num2;};
		AirthmeticOperation div = (num1,num2) -> {return num1/num2;};
		AirthmeticOperation sub = (num1,num2) -> {return num1-num2;};
		
		//printing the result of each operation
		System.out.println(num1+" + "+num2+" : "+sum.operation(num1, num2));
		System.out.println(num1+" - "+num2+" : "+sub.operation(num1, num2));
		System.out.println(num1+" * "+num2+" : "+mul.operation(num1, num2));
		System.out.println(num1+" / "+num2+" : "+div.operation(num1, num2));
		
		
	}
	
}
