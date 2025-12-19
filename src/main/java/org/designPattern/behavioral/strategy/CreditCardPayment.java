package org.designPattern.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("paying with cc of amount : " + amount);

    }
}
