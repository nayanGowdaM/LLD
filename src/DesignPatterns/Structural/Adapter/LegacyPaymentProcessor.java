package DesignPatterns.Structural.Adapter;

public class LegacyPaymentProcessor {
    private long transactionReference;
    private boolean paymentStatus;

    public  void executeTransaction(long amount, String currency) {
        // Simulate transaction processing
        System.out.println("Legacy Payment Processing");
        this.transactionReference = System.currentTimeMillis(); // Simulate a transaction reference
        this.paymentStatus = true; // Simulate a successful payment
        System.out.println("Payment of " + amount + " " + currency + " processed successfully.");
    }

    public boolean checkIfPaymentSuccessful() {
        return this.paymentStatus;
    }

    public long getTransactionReference() {
        return this.transactionReference;
    }
}
