package org.designPattern.behavioral.strategy;


public class Client {
    public static void main(String[] args) {

         PaymentService service = new PaymentService();
         //pay using credit card
         service.setPaymentStrategy(new CreditCardPayment());
         service.checkout(100);

         //switch to upi
        service.setPaymentStrategy(new UPIPayment());
        service.checkout(100);

        //switch to net banking
        service.setPaymentStrategy((new NetBankingPayment()));
        service.checkout(100);
    }

}
