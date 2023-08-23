package payment.factory;

public class ConcretePaymentMethodFactory implements PaymentMethodFactory {
    @Override
    public PaymentMethod createPaymentMethod(String paymentType) {
        if ("credit".equalsIgnoreCase(paymentType)) {
            return new CreditCardPayment();
        } else if ("paypal".equalsIgnoreCase(paymentType)) {
            return new PayPayment();
        } else {
            throw new IllegalArgumentException("Unsupported payment type: " + paymentType);
        }
    }

}
