package DesignPatterns.Structural.Adapter;

public class InHousePaymentProcessor implements  PaymentProcessor{

    boolean paymentSuccessful;
    String transactionId;
    /**
     * @param amount is the amount to be processed
     * @param currency is the currency of the amount
     */
    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("In-house Payment Processing");
        paymentSuccessful = true; // Simulating a successful payment
        transactionId = "TXN_"+ System.currentTimeMillis(); // Generating a mock transaction ID
        System.out.println("Payment Successful: " + amount + " " + currency);
    }

    /**
     * @return 
     */
    @Override
    public boolean isPaymentSuccessful() {
        return this.paymentSuccessful;
    }

    /**
     * @return 
     */
    @Override
    public String getTransactionId() {
        return this.transactionId;
    }
}
