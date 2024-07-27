package com.pattern.observerpattern.subject;

import com.pattern.observerpattern.observer.Trader;

public interface StockMarket {

    void registerTrader(Trader trader);

    void removeTrader(Trader trader);

    void notifyTraders();
}
