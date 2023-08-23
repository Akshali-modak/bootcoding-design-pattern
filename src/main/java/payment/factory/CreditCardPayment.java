package payment.factory;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying ₹" + amount + " using credit card.");
    }
}
