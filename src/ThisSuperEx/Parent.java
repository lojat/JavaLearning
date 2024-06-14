package ThisSuperEx;

public class Parent {
 
	String name;
	int id;
	
	public Parent(){};
	
	public Parent(String name) {
		//this is used for invoke current class methode
		this.display();
		
		//this is used for refer current class variable
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name= "+name);
	}

	public void setName(String name) {
		this.name= name;	
	}
	
}
