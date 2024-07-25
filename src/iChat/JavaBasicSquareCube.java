package ichat;

public class JavaBasicSquareCube {

	public static void main(String[] args) {
		
		int number = 2;
		int res = square(number);
		System.out.println(res);
		res=cube(number);
		System.out.println(res);
		
		number = 3;
		res = square(number);
		System.out.println(res);
		res=cube(number);
		System.out.println(res);
		
		number = 4;
		res = square(number);
		System.out.println(res);
		res=cube(number);
		System.out.println(res);

	}
	
	//method to calculate square
	private static int square(int number) {
		return number*number;
	}


	//method to calculate cube
	private static int cube(int number) {
		return number*number*number;
	}
	
}
