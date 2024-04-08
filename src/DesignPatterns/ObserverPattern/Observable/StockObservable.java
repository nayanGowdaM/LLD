package DesignPatterns.ObserverPattern.Observable;

import DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver obj);
    public void remove(NotificationAlertObserver obj);
    public void notifySubscriber();
    public void setStockCount(int stockCount);
    public int getStockCount();
}
