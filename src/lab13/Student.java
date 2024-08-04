package lab13;
 

public class Student {

	//instance variables
	private String name;
	private int age;
	private String department;
	
	//default constructor
	public Student() {
		this.name = "Unknown";
		this.age = 20;
		this.department= "Unassigned";
	}
	
	// parameter constructor with two arguments : name and age, and initializes the department to "IT".
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.department = "IT";
	}
	
	//parameter constructor with 3 arguments to assign all name, age, and department
	public Student(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "[ name: "+name+" , age: "+age+" , department: "+department+" ]";
	}
	
}
