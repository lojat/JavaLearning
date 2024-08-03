package functional.interfaces;

// the functional interface method directly implemented at the time of object creation is called anonymous class that is for single time used 

interface AnonyClass{
	public void print();
}

public class AnonymousClass {

	public static void main(String[] args) {

		AnonyClass obj = new AnonyClass() {

			@Override
			public void print() {
				
				System.out.println("Anonymouse class");
				
			}
		};

	obj.print();
		
	}

}
