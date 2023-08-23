package payment.factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PaymentApplication {
    public static void main(String[] args) {
     ApplicationContext context =   SpringApplication.run(PaymentApplication.class, args);

        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.makePayment(50, "credit");
        paymentService.makePayment(75, "paypal");
    }
}
