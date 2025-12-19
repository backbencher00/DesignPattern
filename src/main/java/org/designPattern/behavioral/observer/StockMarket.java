package org.designPattern.behavioral.observer;

import java.util.HashSet;


//concrete subject or concrete publisher
public class StockMarket implements StockPublisher{
    HashSet<InvestorSubscriber> investorSubscribers = new HashSet<>();
    private String stockName;
    private double price;
    StockMarket(String s, double p){
        this.stockName = s;
        this.price = p;
    }


    @Override
    public void register(InvestorSubscriber investorSubscriber) {
        investorSubscribers.add(investorSubscriber);
    }

    @Override
    public void unregister(InvestorSubscriber investorSubscriber) {
        investorSubscribers.remove(investorSubscriber);
    }

    @Override
    public void notifyInvestors() {
        for(InvestorSubscriber is : investorSubscribers){
            is.update(stockName, price);
        }
    }

}
