package testbank;

import bank.Account;

public class PremiumAccount extends Account {
    public PremiumAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void specialDeposit(double amount) {
        deposit(amount); // protected access allowed in subclass
    }
}
