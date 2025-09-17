package testbank;

public class TestPremium {
    public static void main(String[] args) {
        PremiumAccount pAcc = new PremiumAccount("PREM999", 5000);
        pAcc.specialDeposit(1000);
        System.out.println("Premium Balance: " + pAcc.getBalance());
    }
}
