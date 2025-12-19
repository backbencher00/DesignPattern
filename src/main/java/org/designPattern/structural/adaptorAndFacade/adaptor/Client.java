package org.designPattern.structural.adaptorAndFacade.adaptor;

public class Client {
    public static void main(String[] args) {
        Bank yesbank = new YesBankAdaptor(new YesBankAPI());
        Bank kotakbank = new KotakBankAdaptor(new KotakBankAPI());
        yesbank.transferMoney(100);
        kotakbank.transferMoney(200);

    }
}
