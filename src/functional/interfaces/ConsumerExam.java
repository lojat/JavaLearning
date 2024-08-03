package functional.interfaces;

import java.util.function.Consumer;

// Consumer interface take one parameter and return void 

class ConsumerDemo{
	public void print(String msg) {
		System.out.println(msg);
	}
}

public class ConsumerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> consumer = new ConsumerDemo()::print;//:: used for method reference
		consumer.accept("Hello java consumer");
		
		
	}

}
