package exception.demo;

public class FinallyEx {

	public static void main(String[] args) {
		 
		int[] arr = new int[1000];
		
		try {
			System.out.println("Try to access out of index element: "+arr[1001]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}finally {
			arr = null;
			System.out.println("All system resources are relesed");
		}
		System.gc();
	}

}
