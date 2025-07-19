package DesignPatterns.Structural.Adapter;

public class LegacyPaymentProcessorAdapter implements  PaymentProcessor{
    private final LegacyPaymentProcessor legacyPaymentProcessor;

    public LegacyPaymentProcessorAdapter(LegacyPaymentProcessor legacyPaymentProcessor) {
        this.legacyPaymentProcessor = legacyPaymentProcessor;
    }

    /**
     * @param amount is the amount to be processed
     * @param currency is the currency of the amount
     */
    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Adapting Legacy Payment Processing");
        legacyPaymentProcessor.executeTransaction((long) amount, currency);
        System.out.println("Legacy Payment Processed: " + amount + " " + currency);
    }

    /**
     * @return if the payment was successful
     */
    @Override
    public boolean isPaymentSuccessful() {
        return legacyPaymentProcessor.checkIfPaymentSuccessful();
    }

    /**
     * @return  the transaction ID
     */
    @Override
    public String getTransactionId() {
        return String.valueOf(legacyPaymentProcessor.getTransactionReference());
    }
}
