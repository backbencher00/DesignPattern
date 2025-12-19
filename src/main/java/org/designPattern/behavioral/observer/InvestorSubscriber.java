package org.designPattern.behavioral.observer;

//observer interface
//subscriber
public interface InvestorSubscriber {
    void update(String stockName, double price);
}
