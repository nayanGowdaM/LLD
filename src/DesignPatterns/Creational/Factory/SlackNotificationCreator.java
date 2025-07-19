package DesignPatterns.Creational.Factory;

public class SlackNotificationCreator extends  NotificationCreator{
    /**
     * @return SlackNotification object
     */
    @Override
    public Notification createNotification() {
        return new SlackNotification();
    }
}
