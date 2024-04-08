package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.StockObservable;

public class MobileAlertObserver  implements  NotificationAlertObserver{
    StockObservable observable;
    String mobileNumber ;

    public MobileAlertObserver(StockObservable observable, String mobileNumber){
        this.observable = observable;
        this.mobileNumber = mobileNumber;
    }
    @Override
    public void update() {
        sendMsg("Product is on stock!! Hurry up");
    }
    private void sendMsg(String msg){
        System.out.println("Message is sent to: " + mobileNumber);
    }
}
