package labs;

class Calculator{
	
	//calculate sum of two integer
	public int calculateSum(int a, int b){
		int res=0;
		res = a+b;
		return res;
	}
	//calculate sum of three double 
	public double calculateSum(double a, double b,double c) {
		double res;
		res= a+b+c;
		return res;
	}
	//calculate sum of array's all elements
	public int calcutaleSum(int[] arr) {
		int res=0;
		int len= arr.length;
		for(int i=0;i<len;i++)
			res+=arr[i];
		return res;
	}
	
}

public class Lab7 {
	public static void main(String[] args) {
		Calculator calculator= new Calculator();
		
		System.out.println(calculator.calculateSum(2, 3));
		System.out.println(calculator.calculateSum(1.2, 2.3, 3.4));;
		System.out.println(calculator.calcutaleSum(new int[]{1,2,3,4,5}));;
		
		
	}

}
