package org.designPattern.behavioral.observer;

//subject interface
//publisher
public interface StockPublisher {
    void register(InvestorSubscriber investorSubscriber);
    void unregister(InvestorSubscriber investorSubscriber);
    void notifyInvestors();
}
