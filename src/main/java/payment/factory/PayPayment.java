package payment.factory;

import org.springframework.stereotype.Component;
import payment.factory.PaymentMethod;

@Component
public class PayPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using PayPal.");

    }
}
