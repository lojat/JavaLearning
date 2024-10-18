package method.refrence;

interface DoingStudentOperation{
	
	Student addStudent();
	
}

class Student{	
	
}



public class ConstructorRef {

	public static void main(String[] args) {
		 
		DoingStudentOperation obj = Student::new ;// getting student obj by constructor method reference
		
		System.out.println(obj.addStudent());

	}

}
