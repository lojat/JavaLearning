package taskMultilevelInheri;

public class Employee extends Person{

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
