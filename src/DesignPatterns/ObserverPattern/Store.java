package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.Observable.IphoneObservable;
import DesignPatterns.ObserverPattern.Observable.StockObservable;
import DesignPatterns.ObserverPattern.Observer.EmailAlertObserver;
import DesignPatterns.ObserverPattern.Observer.MobileAlertObserver;
import DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args){
        StockObservable iphoneStockObservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new MobileAlertObserver(iphoneStockObservable, "8904820919");
        NotificationAlertObserver observer2 = new EmailAlertObserver(iphoneStockObservable, "nayangowda2003@gmail.com");
        NotificationAlertObserver observer3 = new EmailAlertObserver(iphoneStockObservable, "mnayangowda@gmail.com");

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
