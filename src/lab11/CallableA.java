package lab11;

import java.util.concurrent.Callable;

//Callable class that takes an integer n as a parameter

public class CallableA implements Callable{

	int n;
	
	//parameter constructor 
	public CallableA(int n) {
		this.n=n;
	}
	
	//method to get current n value
	public int getN() {
		return this.n;
	}
	
	// overriding call method calculates the sum of the first n natural numbers.
	@Override
	public Object call() throws Exception {
		int sum=0;
		
		for(int i=1;i<=n;i++)
			sum+=n;
		
		return sum;
	}

}


