package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String email ;
    StockObservable observable;

    public  EmailAlertObserver(StockObservable observable, String email){
        this.observable = observable;
        this.email = email;
    }
    @Override
    public void update() {
        sendEmail("Product is in Stock");
    }
    private  void sendEmail(String msg){
        System.out.println("Email is sent to : " + email);
    }
}
