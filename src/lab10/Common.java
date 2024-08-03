package lab10;

public class Common {
	// fun1() this is taking a parameter of String name and printing welcome and
	// after this fun1() will Thread.sleep(3000)
	// and in the last this will print the name
	public void fun1(String name) {
		System.out.print("Welcome ");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(name);
	}
}
