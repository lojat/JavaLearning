package taskAbstract01;

public class PaypalGateway extends PaymentGateway{

	@Override
	public void processPayment() {
		System.out.println("Payment process by Pay Pal");
		
	}

}
