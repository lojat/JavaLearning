package taskabstract01;

public class CreditCardGateway extends PaymentGateway{

	@Override
	public void processPayment() {
		System.out.println("Payment process by Credit Card");
	}

}
