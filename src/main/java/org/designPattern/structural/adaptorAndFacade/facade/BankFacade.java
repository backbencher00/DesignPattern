package org.designPattern.structural.adaptorAndFacade.facade;

public class BankFacade {
    private LoanService loanService = null;
    private NotificationService notificationService = null;
    private AccountService accountService = null;
    public void depositMoney(){
            accountService = new AccountService();
            accountService.transferMoney(100);
    }
    public void sendCommunication(){
        notificationService = new NotificationService();
        notificationService.sendCommunication();
    }
    public void aaplyForLoan(){
        loanService = new LoanService();
        loanService.applyForloan(100);
    }

    public void checkBalance(){
        accountService = new AccountService();
        accountService.getBalance();
    }
}
