package lab19;

public class MethodRefMain {

	public static void main(String[] args) {
		 
		UserInterectionMethodRef user = new UserInterectionMethodRef();
		
		user.setInt(5);
		
		int num = user.getInt();
		
		int res = user.square(num);
		
		System.out.println(num+" square: "+res);
		
	}

}
