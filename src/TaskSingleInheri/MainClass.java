package TaskSingleInheri;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//creating object of derived class
		Smartphone s1= new Smartphone();
		
		//setting data by derived class object
		s1.setBrand("Sony");
		s1.setCameraResolution("32MPx");
		s1.setModel("S23");
		s1.setOperatingSystem("G49000");
		
		//accessing methods by derived class objects
		s1.display();
		s1.takePhoto(true);
		s1.status(false);
		
	}

}
