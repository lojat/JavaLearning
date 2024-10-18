package method.refrence;

interface Run{
	
	void run(int i);
	
}

class Example{
	
	public void NormalMethod(int i) {
		System.out.println("running : "+i);
	}
	
}

public class InstantMethodRef {

	public static void main(String[] args) {
		 
		Example ex = new Example();
		
		Run run = ex::NormalMethod;
		Run o2 = new Example()::NormalMethod;
		
		run.run(90);
		o2.run(70);
		
	}

}
