package exception.demo;

public class NestedTryEx {

	public static void main(String[] args) {
		  
		int i =1000;
		
		try {
			try {
				int j =i/0;
			}catch(ArithmeticException e) {
				System.out.println(e);
			}
			
			try {
				i=Integer.parseInt("Helo");
			}catch(NumberFormatException e){
				System.out.println(e);
			}
			
			int[] arr= new int[2];
			System.out.println(arr[7]);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
