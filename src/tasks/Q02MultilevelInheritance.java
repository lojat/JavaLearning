package tasks;
 
class Person {
	
	protected String name;
	private int age;
	
	public void display() {
		System.out.println("Person Name= "+name+" Age= "+age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}

class Employee extends Person{

	private int empId;
	private String dep;
	
	public void display() {
		System.out.println("Employe Id= "+empId+" Department= "+dep+" Name= "+super.getName()+" Age="+super.getAge());
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	
}


class Manager extends Employee{

	private int teamSize;

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public void display() {
		System.out.println(" Id= "+super.getEmpId()+" Department= "+super.getDep()+" Name= "+super.getName()+" Age="+super.getAge()+" TeamSize= "+teamSize);
	}
	 
}


public class Q02MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Manager m1 = new Manager();
		
		m1.setName("Ashish");
		m1.setAge(22);
		m1.setDep("Jr Devloper");
		m1.setEmpId(001);
		m1.setTeamSize(3);

		m1.display();
		
	}

}
