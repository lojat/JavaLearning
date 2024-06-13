package staticEx;


//static is for memory management the instance of static is constant for all objects its belongs to class rather then objects
class Clg{
	
	int rollNo;
	//  static variable can be access by class name directly
	static String clgName;
	
	//static method 
	static void diplay(int rollNo,String cklgName){
		System.out.println("Roll No. ="+rollNo+" clgName ="+clgName);
	}
	
	//static block is called automatic when class has loaded  
	static {
		System.out.println("static block");
	}
	
}

public class Student {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("College Name= "+Clg.clgName);
		
		Clg c1 = new Clg();
		c1.rollNo =001;
		
		//initialize static variable by class name  
		Clg.clgName ="Bansal";
		
		//calling method by class name
		Clg.diplay(500, "NRI");
		System.out.println("College Name ="+c1.clgName+" RollNo. = "+c1.rollNo);
		
	}

}
