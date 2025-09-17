package bank;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    protected void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". Balance: " + balance);
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal!");
        }
    }

    private void applyInternalFee() {
        balance -= 5;
        System.out.println("Internal fee applied. Balance: " + balance);
    }

    public void applyMonthlyFee() {
        applyInternalFee();
    }
}
