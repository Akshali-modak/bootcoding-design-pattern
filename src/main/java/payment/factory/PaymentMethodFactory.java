package payment.factory;

import org.springframework.stereotype.Component;
import payment.factory.PaymentMethod;

@Component
public interface PaymentMethodFactory {
    PaymentMethod createPaymentMethod(String paymentType);
}
