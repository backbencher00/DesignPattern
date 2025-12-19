package org.designPattern.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        StockMarket tcs = new StockMarket("tcs", 256.00);
        InvestorSubscriber mobileInvestor = new MobileApp();
        InvestorSubscriber webInvestor = new Webdashboard();
        tcs.register(mobileInvestor);
        tcs.register(webInvestor);
        tcs.notifyInvestors();
        tcs.unregister(mobileInvestor);
        tcs.notifyInvestors();
    }
}
