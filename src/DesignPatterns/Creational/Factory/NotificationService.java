package DesignPatterns.Creational.Factory;

public class NotificationService {
    public static void main(String[] args) {
        // Create an instance of EmailNotificationCreator
        NotificationCreator  creator = new EmailNotificationCreator();
        creator.send("Hello, this is a test email notification!");

        // Create an instance of SMSNotificationCreator
        creator = new SMSNotificationCreator();
        creator.send("Hello, this is a test SMS notification!");

        // You can add more notification types in the future

    }
}
