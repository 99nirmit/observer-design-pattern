package com.pattern.observerpattern.subject;

import com.pattern.observerpattern.observer.Trader;

import java.util.ArrayList;
import java.util.List;

public class StockExchange implements StockMarket{

    private List<Trader> traders;

    private String stock;

    private double price;

    public StockExchange(){
        traders = new ArrayList<>();
    }

    @Override
    public void registerTrader(Trader trader) {

        traders.add(trader);
    }

    @Override
    public void removeTrader(Trader trader) {

        traders.remove(trader);
    }

    @Override
    public void notifyTraders() {
        for (Trader trader : traders){
            trader.update(stock, price);
        }
    }

    public void setStockPrice(String stock, double price){
        this.stock = stock;
        this.price = price;
        notifyTraders();
    }
}
