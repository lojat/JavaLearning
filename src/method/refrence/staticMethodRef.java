package method.refrence;


interface Square{
	
	void square(int num);
	
}


class SquareClass{

	public static void getSquare(int num) {
		System.out.println(num+" square: "+ num*num);
	}
	
}


public class staticMethodRef {

	public static void main(String[] args) {

		Square obj1 = new Square(){// Anonymous class

			@Override
			public void square(int num) {

				System.out.println(num+" square: "+num*num);
				
			}
			
		};
		
		Square obj2 = (s -> System.out.println(s +" square : "+s*s));//lambda expresstion

		
		Square obj3 = SquareClass::getSquare ;// method reference

		obj1.square(7);
		obj2.square(8);
		obj3.square(9);
		
	}

}
