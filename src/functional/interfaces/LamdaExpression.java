package functional.interfaces;

interface Lambda{
	int sum(int a,int b);

}

public class LamdaExpression {

	public static void main(String[] args) {
		 
		Lambda lambda = (a,b) ->{return a+b;};
		
		Lambda lambda1 =(a,b) ->(a+b);
		
		System.out.println(lambda.sum(2,9));
		
		System.out.println(lambda1.sum(19,9));

	}

}
