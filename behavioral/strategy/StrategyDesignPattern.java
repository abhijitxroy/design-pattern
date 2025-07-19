package behavioral.strategy;

public class StrategyDesignPattern {
	public static void main(String[] args) {
		CashPayment cashPayment = new CashPayment();
		PaymentStrategy paymentStrategy1 = new PaymentStrategy(cashPayment);
		paymentStrategy1.processPayment(1000);

		UpiPayment upiPayment = new UpiPayment();
		PaymentStrategy paymentStrategy2 = new PaymentStrategy(upiPayment);
		paymentStrategy2.processPayment(800);
	}
}

interface Payment {
	void pay(double amount);
}

class CashPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Cash Payment: " + amount);
	}
}

class CreditCardPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("CreditCard Payment: " + amount);
	}
}

class UpiPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("UPI Payment: " + amount);
	}
}

class PaymentStrategy {
	private Payment payment;

	public PaymentStrategy(Payment payment) {
		this.payment = payment;
	}

	public void processPayment(double amount) {
		payment.pay(amount);
	}
}