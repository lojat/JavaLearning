package ichat;

//Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee,
//with subclasses Manager, Developer, and Programmer. Each subclass should have properties 
//such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.

//The base class Employee
class Employee {
	//common properties name, address
	
	Employee() {
	};

	protected int calculateBonuses(int salary){
		return salary/10;
	}
	
	protected String performanceReport(int rating){
		if(rating>7)
			return "Excellent";
		else if(rating>5)
			return "Good";
		else
			return "Not good";
	}
	
	protected int manageprojects(String jobTitle){
		if(jobTitle=="Manager")
			return 5;
		else if(jobTitle=="Developer")
			return 3;
		else 
			return 1;
	}

}

//subclass Manager
class Manager extends Employee {
	private int salary;
	private String jobTitle;
	private String name;
	private String address;


	Manager() {
	};

	Manager(int salary, String jobTitle, String name, String address) {
		this.name=name;
		this.address=address;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}

	public int getSalary() {
		return salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Manager [salary=" + salary + ", jobTitle=" + jobTitle + ", name=" + name + ", address=" + address + "]";
	}

	 
}

//subclass Developer
class Developer extends Employee {
	private int salary;
	private String jobTitle;
	private String name;
	private String address;


	Developer(){};

	Developer(int salary,String jobTitle,String name,String address){
		this.name=name;
		this.address=address;
		this.salary=salary;
		this.jobTitle=jobTitle;
	}

	public int getSalary() {
		return salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Developer [salary=" + salary + ", jobTitle=" + jobTitle + ", name=" + name + ", address=" + address
				+ "]";
	}
 

}

//subclass Programmer
class Programmer extends Employee {
	private int salary;
	private String jobTitle;
	private String name;
	private String address;

	Programmer(){};

	Programmer(int salary,String jobTitle,String name,String address){
		this.name=name;
		this.address=address;
		this.salary=salary;
		this.jobTitle=jobTitle;
	}
	public int getSalary() {
		return salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return "Programmer [salary=" + salary + ", jobTitle=" + jobTitle + ", name=" + name + ", address=" + address
				+ "]";
	}

	 
}

public class InheritanceHierarchy {

	public static void main(String[] args) {
		
		Manager manager= new Manager(100000,"Manager","Lokesh","Bhopal");
		
		Developer developer= new Developer(80000,"Developer","akash","baliya");
		
		Programmer programmer= new Programmer(50000,"Programmer","Ashish","astha");
		
		System.out.println(manager.toString());
		System.out.println("Bonuses: "+manager.calculateBonuses(manager.getSalary())+" Performance: "+manager.performanceReport(6)+" Projects: "+manager.manageprojects(manager.getJobTitle()));
		
		
		System.out.println(developer.toString());
		System.out.println("Bonuses: "+developer.calculateBonuses(developer.getSalary())+" Performance: "+developer.performanceReport(9)+" Projects: "+developer.manageprojects(developer.getJobTitle()));
		
		System.out.println(programmer.toString());
		System.out.println("Bonuses: "+programmer.calculateBonuses(programmer.getSalary())+" Performance: "+programmer.performanceReport(3)+" Projects: "+programmer.manageprojects(programmer.getJobTitle()));

	}

}
