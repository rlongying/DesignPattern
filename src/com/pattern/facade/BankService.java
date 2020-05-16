package com.pattern.facade;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * facade class to wrap all the service of sub system, hide the details from the clients, and
 * provide interfaces from clients
 */
public class BankService {
    private Map<Account.Type, Account> accountMap;

    public BankService() {
        this.accountMap = new HashMap<>();
    }

    public int createBankAccount(Account.Type type, BigDecimal amount) {
        Account account = null;
        switch (type) {
            case CHEQUE:
                account = new ChequeAccount(amount);
                break;
            case SAVING:
                account = new SavingAccount(amount);
                break;
            case INVESTMENT:
                account = new InvestmentAccount(amount);
                break;
            default:
                System.out.println("Invalid Account Type");
        }

        if (amount != null) {
            accountMap.put(type, account);
            return 1;
        }
        return -1;
    }

    public int transfer(Account.Type from, Account.Type to, BigDecimal amount) {
        return accountMap.get(from).transfer(accountMap.get(to), amount);
    }

    public BigDecimal getAmount(Account.Type type) {
        if (accountMap.containsKey(type)) {
            return accountMap.get(type).getAmount();
        }
        return BigDecimal.ZERO;
    }
}
