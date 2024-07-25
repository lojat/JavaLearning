package ichat;
//
//Write a Java program that prints the numbers from 1 to 50. But for multiples of four print "Fizz" instead of the number and for 
//the multiples of five print "Buzz". For numbers which are multiples of both four and five print "FizzBuzz".

public class JavaBasicFizzBuzz {

	public static void main(String[] args) {
		
		int limit = 50;
		
		print(limit);

	}
	//method print
	static void print(int limit) {
		//iterate all number 1 to limit
		for(int i =1;i<=limit;i++) {
			//if number divisible by both
			if(i%4==0&&i%5==0)
				System.out.println("FizzBuzz");
			//if divided by 4
			else if(i%4==0)
				System.out.println("Fizz");
			//if divided by 5
			else if(i%5==0)
				System.out.println("Buzz");
			//if not divided by both
			else
				System.out.println(i);
		}
		
	}
}
