package DesignPatterns.Creational.Factory;

public class SMSNotification implements  Notification{

    /**
     * @param message:   message to be sent via SMS
     */
    @Override
    public void send(String message) {
        System.out.println("SMS notification sent with message: " + message);
    }
}
