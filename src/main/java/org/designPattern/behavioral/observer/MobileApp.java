package org.designPattern.behavioral.observer;
//concrete subcreber or observer
public class MobileApp implements InvestorSubscriber{

    @Override
    public void update(String stockName, double price) {
        System.out.println("mobileApp stockName : " + stockName + " updated to price : " + price);
    }
}
