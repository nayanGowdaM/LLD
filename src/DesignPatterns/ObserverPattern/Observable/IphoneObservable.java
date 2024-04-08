package DesignPatterns.ObserverPattern.Observable;

import DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifySubscriber() {
        for( NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newSotckAdded) {
        if(stockCount == 0){
            notifySubscriber();
        }
        stockCount += newSotckAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
