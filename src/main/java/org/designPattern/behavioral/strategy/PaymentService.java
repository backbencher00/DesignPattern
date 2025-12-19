package org.designPattern.behavioral.strategy;

public class PaymentService {
    PaymentStrategy strategy = null;
    public void setPaymentStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void checkout(double amount){
        if(this.strategy == null){
            throw new RuntimeException("payment method not found");
        }
        this.strategy.pay(amount);
    }
}
