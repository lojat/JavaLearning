package jun10;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a1= new Address();
		//initialize variable by setter
		
		a1.setCity("mpnagar");
		a1.setDist("Bhopal");
		a1.setPin(462026);
		a1.setState("MP");
		
		Student s1 = new Student();
		
		s1.setId(001);
		s1.setName("Ashish");
		s1.setAdd(a1);
		
		//accessing value by getter
		System.out.println("By getter: - ");
		System.out.println("Id= "+s1.getId()+" Name = "+s1.getName()+" Add = "+s1.getAdd()+"\n");
		
		//initialize variable by parameter constructor 
		Address a2 = new Address("Ashoka garden","Bhopal","MP",462025);
		
		//accessing values by toString
		System.out.println("By toString:- ");
		Student s2 = new Student(002,"Ashish",a2);
		
		System.out.println(s2.toString());

	}

}
