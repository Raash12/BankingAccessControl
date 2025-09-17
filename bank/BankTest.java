package bank;

public class BankTest {
    public static void main(String[] args) {
        Account acc = new Account("ACC123", 1000);
        System.out.println("Account No: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());
        acc.deposit(300);
        acc.withdraw(100);
        acc.applyMonthlyFee();
    }
}
