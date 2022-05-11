package Bootcamp.SecondExercise.BankAccount;

public class BankAccount {

    private double balance;


    public BankAccount() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 5000) {
            System.out.println("Transaction is cancelled max deposit is 5000 | Your deposit is " + amount);
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Transaction is Cancelled");
        }
    }

    public double printBalance() {
        return balance;
    }

    public void transferFrom(double amount, BankAccount bankAccount) {
        if (amount <= balance) {
            balance = balance - amount;
            bankAccount.balance += amount;
        } else {
            System.out.println("Transform is cancelled, deposit some money");
        }
    }
}

