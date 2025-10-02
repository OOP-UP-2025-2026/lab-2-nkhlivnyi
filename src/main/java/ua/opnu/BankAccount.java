package ua.opnu;

public class BankAccount {
    public String name;
    public double balance;
    public double transactionFee = 0.0;

    public BankAccount() {
        this.name = "Unknown";
        this.balance = 0.0;
    }

    public BankAccount(String name, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.name = name;
        this.balance = balance;
    }

    public void setTransactionFee(double fee) {
        if (fee < 0) {
            throw new IllegalArgumentException("Fee cannot be negative");
        }
        this.transactionFee = fee;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be greater than zero");
        }
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }
        double total = amount + transactionFee;
        if (balance >= total) {
            balance -= total;
            return true;
        }
        return false;
    }

    public boolean transfer(BankAccount receiver, double amount) {
        if (receiver == null || amount <= 0) {
            return false;
        }
        double total = amount + transactionFee;
        if (balance >= total) {
            balance -= total;
            receiver.balance += amount;
            return true;
        }
        return false;
    }
}

