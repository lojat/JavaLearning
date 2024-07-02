package labs;

//
//Employee: The base class that represents a university employee. It has attributes employeeId, name, and salary.
//Faculty: A subclass of Employee that represents a faculty member. It has an additional attribute department.
//Staff: A subclass of Employee that represents a staff member. It has an additional attribute jobTitle.

class Employee{
	
	private  int employeeId;
	private String name;
	private int salary;
	
	
	public Employee(int employeeId, String name, int salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}

class Faculty extends Employee{
	
	private String department;

	public Faculty(int employeeId, String name, int salary, String department) {
		super(employeeId, name, salary);
		this.department = department;
	}

	@Override
	public String toString() {
		return "Faculty [department=" + department + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}

class Staff  extends Employee{
	
	private String jobTitle;

	public Staff(int employeeId, String name, int salary, String jobTitle) {
		super(employeeId, name, salary);
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Staff [jobTitle=" + jobTitle + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}



public class Lab01_8314 {

	public static void main(String[] args) {
	 
		Employee e1 = new Employee(101,"Ashish",25000);
		System.out.println("Attributes of Emloyee class by Employee class object:");
		System.out.println(e1.toString()+"\n");
		
		Faculty f1 = new Faculty(102,"Akash",32000,"Software");
		System.out.println("Attributes of Emloyee class and Faculty class by Faculty class object:");
		System.out.println(f1.toString()+"\n");
		
		Staff s1 = new Staff(102,"Pawan",12000,"Sales Excecutive");
		System.out.println("Attributes of Emloyee class and Faculty class by Faculty class object:");
		System.out.println(s1.toString()+"\n");


	}

}
