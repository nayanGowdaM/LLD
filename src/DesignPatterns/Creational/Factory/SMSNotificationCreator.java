package DesignPatterns.Creational.Factory;

public class SMSNotificationCreator extends   NotificationCreator{
    /**
     * @return smsNotification object
     */
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
