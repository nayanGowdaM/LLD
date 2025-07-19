package DesignPatterns.Structural.Adapter;

public class ECommerceAppV2 {
    public static void main(String[] args) {
        // PaymentGateway Interface
        // PaymentGateway Implementation
        // LegacyGateway
        // LegacyGatewayAdapter interface and implementation
        // CheckoutService

        // Use the In-house Payment Gateway
        PaymentProcessor paymentProcessor = new InHousePaymentProcessor();
        CheckoutService checkoutService = new CheckoutService(paymentProcessor);
        checkoutService.checkout(100.0, "USD");

    }
}
