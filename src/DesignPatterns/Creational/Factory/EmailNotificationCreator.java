package DesignPatterns.Creational.Factory;

public class EmailNotificationCreator extends  NotificationCreator{
    /**
     * @return EmailNotification object
     */
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
