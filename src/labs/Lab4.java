package labs;

public class Lab4 {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5};
		int len = arr.length;
		
		try {
			System.out.println(arr[len-1]);
			System.out.println(arr[len]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		
		System.out.println("End!");
	}

}
