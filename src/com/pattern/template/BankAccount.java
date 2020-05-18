package com.pattern.template;

public abstract class BankAccount {
    protected int balance = 0;

    public BankAccount(int amount) {
        this.balance = amount;
    }

    public final void withdraw(int amount) {
        // fixed steps to do things
        if(!authenticate()) {
            System.out.println("not authenticated");
            return;
        }

        if (!checkBalance(amount)) {
            System.out.println("not enough balance");
            return;
        }

        if (!transact(amount)) {
            System.out.println("transaction failed");
            return;
        }

        show(amount);

    }

    // unique implementation required for different account
    public abstract boolean authenticate();
    public abstract boolean checkBalance(int amount);
    public abstract boolean transact(int amount);

    private void show(int amount) {
        // some common functions
        System.out.println(amount + " dollars have been withdrawn");
    }
}
