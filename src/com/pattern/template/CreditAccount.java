package com.pattern.template;

public class CreditAccount extends BankAccount {
    private int credit;

    public CreditAccount(int amount, int credit) {
        super(amount);
        this.credit = credit;
    }

    @Override
    public boolean authenticate() {
        System.out.println("Credit Account authenticating ...");
        return true;
    }

    @Override
    public boolean checkBalance(int amount) {
        return (this.credit + this.balance) >= amount;
    }

    @Override
    public boolean transact(int amount) {

        if (this.balance < amount) {
            this.credit -= amount - this.balance;
            this.balance = 0;

        } else {
            this.balance -= amount;
        }
        System.out.println("balance: " + this.balance + ", credit: " + credit);
        return true;
    }
}
