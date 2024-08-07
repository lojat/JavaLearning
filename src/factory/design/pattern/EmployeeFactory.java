package factory.design.pattern;

public class EmployeeFactory {

	public static Employee getEmp(String empType) {
		
		if(empType.trim().equalsIgnoreCase("Android Developer") ) {
			return new AndroidDeveloper();
		}else {
			return new WebDeveloper();
		}
	}
	
}
