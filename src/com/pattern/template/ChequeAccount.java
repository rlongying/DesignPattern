package com.pattern.template;

public class ChequeAccount extends BankAccount {

    public ChequeAccount(int amount) {
        super(amount);
    }

    @Override
    public boolean authenticate() {
        System.out.println("Check Account authenticating ...");
        return true;
    }

    @Override
    public boolean checkBalance(int amount) {
        return this.balance >= amount;
    }

    @Override
    public boolean transact(int amount) {
        this.balance -= amount;
        System.out.println("balance: " + this.balance);
        return true;
    }
}
