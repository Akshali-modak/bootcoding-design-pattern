package payment.factory;

import org.springframework.stereotype.Component;

@Component
public interface PaymentMethod {
    void pay(double amount);
}
