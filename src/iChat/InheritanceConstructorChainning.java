package iChat;

//Describe the concept of constructor chaining and how it works in Java inheritance.?


//base class with variable and constructor 
class Person{
	String name;
	int age;
	
	public Person() {};
	
	public Person(int age) {
		if(age>18) {
			System.out.println("minner");
		}
	}
	
	public Person(String name, int age) {
		//calling another parameter constructor 
		this(age);
		this.name=name;
		this.age=age;
	}
}

// derived class with variable, constructor & toSring method
class Student extends Person{
	int rollNo;
	
	public Student() {};
	
	public Student(int rollNo,String name,int age){
		//calling the base class constructor by super 
		super(name,age);
		this.rollNo=rollNo;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age +"]";
	}
}

public class InheritanceConstructorChainning {

	public static void main(String[] args) {
		 
		String name ="Lokesh";
		int age = 24;
		int rollNo =101;
		
		Student student = new Student(rollNo,name,age);
		
		System.out.println(student.toString());

	}

}
