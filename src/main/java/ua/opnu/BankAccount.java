package ua.opnu;

public class BankAccount {
    public double balance;
    public double transactionFee;

    public void deposit(double amount) {
        if (amount <= 0) return;
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) return false;
        double newBalance = balance - amount - transactionFee;
        if (newBalance < 0) return false;
        balance = newBalance;
        return true;
    }

    public boolean transfer(BankAccount other, double amount) {
        if (amount <= 0) return false;
        if (!withdraw(amount)) return false;
        other.deposit(amount);
        return true;
    }
}


