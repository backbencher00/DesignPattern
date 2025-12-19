package org.designPattern.behavioral.observer;

public class Webdashboard implements InvestorSubscriber{
    @Override
    public void update(String stockName, double price) {
        System.out.println("Webdashboard stockName : " + stockName + " updated to price : " + price);
    }
}
