package com.pattern.observerpattern.observer;

public class AngelBroking implements Trader{
    @Override
    public void update(String stock, double price) {
        System.out.println("Angel Broking Notified. Stock " + stock + " , Price: " + price);
    }
}
