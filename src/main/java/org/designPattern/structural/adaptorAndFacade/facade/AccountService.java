package org.designPattern.structural.adaptorAndFacade.facade;

public class AccountService {
    public void transferMoney(int amount){
        System.out.println(amount + " rupees is send to sourabh");
    }
    public void getBalance(){
        System.out.println(200 + " rupees is your remaining balance");
    }
}
