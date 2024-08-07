package factory.design.pattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeFactory ef = new EmployeeFactory();
		
		Employee e1 = ef.getEmp("Android Developer");
		
		Employee e2 = ef.getEmp("Web Developer");
		
		System.out.println(e1.getSalary());
		System.out.println(e2.getSalary());
		
	}

}
