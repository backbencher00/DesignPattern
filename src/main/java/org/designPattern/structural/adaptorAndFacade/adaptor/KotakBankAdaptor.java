package org.designPattern.structural.adaptorAndFacade.adaptor;

public class KotakBankAdaptor implements Bank {
    private KotakBankAPI api = null;
    KotakBankAdaptor(KotakBankAPI api){
        this.api = api;
    }
    @Override
    public void transferMoney(int amount) {
        api.makePayment(amount);
    }
}
