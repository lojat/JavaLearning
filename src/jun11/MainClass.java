package jun11;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Appliance a1 = new Appliance();
		
		a1.setBrandName("LG");
		a1.setPrice(7000);
		
		System.out.println(a1);
		
		Television t1= new Television();
		
		t1.setBrandName("Samsung");
		t1.setPrice(10000);
		t1.setLoudness("High");
		t1.setSize(36);
		
		System.out.println(t1.toString());

	}

}
