package taskabstract01;

public class App {

	public static void main(String[] args) {

		CreditCardGateway cc = new CreditCardGateway ();
		PaypalGateway pp = new PaypalGateway();
		
		cc.processPayment();
		pp.processPayment();
		
	}

}
