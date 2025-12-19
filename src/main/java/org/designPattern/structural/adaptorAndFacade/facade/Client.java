package org.designPattern.structural.adaptorAndFacade.facade;

public class Client {
    public static void main(String[] args) {
        BankFacade facade = new BankFacade();
        facade.aaplyForLoan();
        facade.checkBalance();
        facade.sendCommunication();
        facade.depositMoney();
    }

}
