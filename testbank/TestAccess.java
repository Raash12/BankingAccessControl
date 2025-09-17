package testbank;

import bank.Account;

public class TestAccess {
    public static void main(String[] args) {
        Account acc = new Account("EXT123", 2000);
        System.out.println("Account No: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());
        acc.applyMonthlyFee();
    }
}
