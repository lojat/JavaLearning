package exceptionDemo;

public class PropagationExceptionEx {
	
	void first() {
		String s= "918l";
		int i=Integer.parseInt(s);
	}
	
	void second() {
		first();
	}
	
	void third(){
		try {
			second();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		 
		PropagationExceptionEx pe = new PropagationExceptionEx();
		
		pe.third();

	}

}
