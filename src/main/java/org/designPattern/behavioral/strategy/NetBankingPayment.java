package org.designPattern.behavioral.strategy;

public class NetBankingPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("paying with net banking of amount : " + amount);
    }
}
