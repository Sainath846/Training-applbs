class BankAccount {
    private String accName;
    private int accNo, balance;
    public BankAccount (int accNo, String accName, int balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
    }

    public void deposit(int amount) {

    }

    public void withdraw(int amount) {

    }

    public int getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private float interestRate;

    public SavingsAccount(int accNo, String accName, int balance, float interestRate) {
        super(accNo, accName, balance);
        this.interestRate = interestRate;
    }


}


public class BankMain {
}
