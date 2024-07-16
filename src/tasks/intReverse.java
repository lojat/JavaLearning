package tasks;

public class intReverse {

	public static void main(String[] args) {

		int n =-5433745;

		reverse(n);
	
		reverse1(n);
		

	}	
	private static void reverse1(int n) {
		// TODO Auto-generated method stub
		while(n!=0) {
			System.out.print(Math.abs(n%10));
			n=n/10;
		}
		
	}
	private static void reverse(int n) {
		boolean flag = true;
		if (n < 2147483647 && n > -2147483648) {
			if (n < 0)
				System.out.print("-");
			while (flag) {
				if ((n < 10 && n >= 0) || (n > -10 && n <= 0)) {
					flag = false;
				}
				System.out.print(Math.abs((n) % 10));
				n = n / 10;
			}

		}else {
			System.out.println("no");
		}
		
	}

}
