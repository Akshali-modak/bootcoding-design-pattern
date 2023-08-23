package payment.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import payment.factory.PaymentMethod;
import payment.factory.PaymentMethodFactory;

@Component
public class PaymentService {
    private final PaymentMethodFactory paymentMethodFactory;

    @Autowired
    public PaymentService(PaymentMethodFactory paymentMethodFactory) {
        this.paymentMethodFactory = paymentMethodFactory;
    }

    public void makePayment(double amount, String paymentType) {
        PaymentMethod paymentMethod = paymentMethodFactory.createPaymentMethod(paymentType);
        paymentMethod.pay(amount);
    }
}
