package org.designPattern.structural.adaptorAndFacade.adaptor;

public class YesBankAdaptor implements Bank {
    private YesBankAPI api  = null;
    YesBankAdaptor(YesBankAPI api){
        this.api = api;
    }
    @Override
    public void transferMoney(int amount) {
        api.sendFunds(amount);
    }
}
