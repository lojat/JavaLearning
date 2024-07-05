package taskStatic01;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter c1= new Counter();
		Counter c2= new Counter();
		Counter c3= new Counter();
		
		c1.increment();
		c1.increment();
		c2.increment();
		c2.increment();
		c3.increment();
		
		System.out.println("Value of Count= "+Counter.getCount());
		
	}

}
