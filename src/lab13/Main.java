package lab13;

//


public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();// Making obj of student with default constructor
		Student student2 = new Student("Akash",25);// making obj of student with two parameter constructor
		Student student3 = new Student("Ashish",28,"Developer");// making obj of student with three parameter constructor

		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
	}

}
