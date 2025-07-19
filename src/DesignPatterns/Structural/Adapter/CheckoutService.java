package DesignPatterns.Structural.Adapter;

public class CheckoutService {
    private final PaymentProcessor paymentProcessor;
    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount, String currency) {
        System.out.println("Initiating checkout for amount: " + amount + " " + currency);
        paymentProcessor.processPayment(amount, currency);
        if (paymentProcessor.isPaymentSuccessful()) {
            System.out.println("Payment successful! Transaction ID: " + paymentProcessor.getTransactionId());
        } else {
            System.out.println("Payment failed.");
        }
    }

}
