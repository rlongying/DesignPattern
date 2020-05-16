package com.pattern.facade;

import java.math.BigDecimal;

public abstract class Account {
    public enum Type {
        SAVING,
        CHEQUE,
        INVESTMENT
    }

    private BigDecimal amount;

    public Account(BigDecimal amount) {
        this.amount = amount;
    }

    public int withdraw(BigDecimal amount) {
        if (this.amount.compareTo(amount) >= 0) {
            this.amount = this.amount.subtract(amount);
            return 1;
        }
        return -1;
    }

    public int deposit(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) < 0){
            return -1;
        }

        this.amount = this.amount.add(amount);

        return 1;
    }

    public int transfer(Account to, BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) < 0 || this.amount.compareTo(amount) < 0) {
            return -1;
        }
        this.amount = this.amount.subtract(amount);
        to.amount = to.amount.add(amount);
        return 1;
    }

    public BigDecimal getAmount() {
        return amount;
    }

}
