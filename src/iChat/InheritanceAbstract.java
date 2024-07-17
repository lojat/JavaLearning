package iChat;

//abstract class
abstract class Bike{

	//abstract method
	abstract String strock(String model);

	//non-abstract method
	int speed(int cc) {
		if(cc>600)
			return 190;
		else if(cc>300)
			return 150;
		else
			return 90;
	}
}

//derived class
class Honda extends Bike{
	
	int cc;
	String model;
	
	//constructor
	Honda(int cc, String model){
		this.cc=cc;
		this.model=model;
	}
	
	//implementation of abstract method
	String strock(String model) {
		 if(model=="HeroPuk")
			 return "Two Strock";
		 else
			 return "Four strock";
	}

	public int getCc() {
		return cc;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "Honda [cc=" + cc + ", strock=" + model + "]";
	}
	
}

public class InheritanceAbstract {

	public static void main(String[] args) {
		 
		Honda honda= new Honda(190,"HeroPuk");
		
		System.out.println("Speed: "+honda.speed(honda.getCc()));
		System.out.println("Strock: "+honda.strock(honda.getModel()));
		
	}

}
