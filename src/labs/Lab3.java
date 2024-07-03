package labs;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		 super(str);
	 }
}

class Person{
	private int age;
	
	public Person(int age) throws InvalidAgeException{
		if(age<18||age>100) {
			throw new InvalidAgeException("Age: "+age+" Your not eligible for vote."); 
		}
		else
			System.out.println("Age: "+age+" You can Vote");
	}
}

public class Lab3 {

	public static void main(String[] args) {
		
		try {
			Person person = new Person(22);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		 
		try {
			Person person = new Person(10);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
		try {
			Person person = new Person(87);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}

}
