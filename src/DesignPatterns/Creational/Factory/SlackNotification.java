package DesignPatterns.Creational.Factory;

public class SlackNotification implements  Notification{
    /**
     * @param message : message to be sent via Slack
     */
    @Override
    public void send(String message) {
        System.out.println("Slack notification sent with message: " + message);
    }
}
