package ThisSuperEx;

public class Child extends Parent{
	
	int age;

	public Child(int age) {
		
		//super is used to call parent class cunstructor any types
		super("aksh");
		
		//super is used for access parent class objects
		super.id=001;
		
		this.age = age;
	}
	 
	public Child() {
		
		// his is used to call construtor within custructor
		this(8);
	}
	
	public void display() {
		System.out.println("Name= "+super.name+" Age= "+this.age+" Id= "+id);
	}

}
