package lab20;

public class Logging {

	private Logging() {
		
	}
	
	Logging instance = null;
	
	public Logging getInstance() {
		
		if(instance==null) {
			return new Logging();
		}
		else
			return instance;
		
	}
	
	public void logMasg(String str) {
		System.out.println("Your Log: "+str);
	}
	
}
