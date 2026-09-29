// Program 2.4: Payment Gateway Interface
public class Abstraction4 {
    interface PaymentGateway {
        void processPayment(double amount);
    }

    static class CreditCardPayment implements PaymentGateway {
        @Override
        public void processPayment(double amount) {
            System.out.println("Processing Credit Card Payment of $" + amount);
        }
    }

    public static void main(String[] args) {
        PaymentGateway payment = new CreditCardPayment();
        payment.processPayment(250.75);
    }
}
