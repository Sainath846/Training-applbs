interface Account {
    void deposit(float amount);
    void withdraw(float amount);
    float getBalance();
}

class SavingAccount implements Account {
    float balance=0;

    @Override
    public void deposit(float amount) {
        balance += amount;
    }

    @Override
    public void withdraw(float amount) {
        balance -= amount;
    }

    @Override
    public float getBalance() {
        return balance;
    }
}

class Currentaccount implements Account {
    float balance;

    @Override
    public void deposit(float amount) {
        balance += amount;
    }

    @Override
    public void withdraw(float amount) {
        balance -= amount;
    }

    @Override
    public float getBalance() {
        return balance;
    }
}
public class Account_main {
    public static void main(String[] args) {
        SavingAccount SA = new SavingAccount();
        Currentaccount CA = new Currentaccount();

        SA.deposit(1000);
        SA.deposit(200);
        System.out.println("Savings account balance = "+SA.getBalance());
        SA.withdraw(500);
        System.out.println("Savings account balance = "+SA.getBalance());

        CA.deposit(4000);
        CA.deposit(400);
        System.out.println("Current account balance = "+CA.getBalance());
        CA.withdraw(1000);
        System.out.println("Current account balance = "+CA.getBalance());

    }
}
