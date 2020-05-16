package com.pattern.facade;

import java.math.BigDecimal;

public class BankClient {
    public static void main(String[] args) {
        /*
        the client can use the bank service to manage account without worrying about the details
         */
        BankService bankService = new BankService();
        bankService.createBankAccount(Account.Type.SAVING, new BigDecimal(1000));
        bankService.createBankAccount(Account.Type.CHEQUE, new BigDecimal(500));
        System.out.println("before transfer:");
        System.out.println("SAVING: " + bankService.getAmount(Account.Type.SAVING));
        System.out.println("CHEQUE: " + bankService.getAmount(Account.Type.CHEQUE));
        bankService.transfer(Account.Type.SAVING, Account.Type.CHEQUE, new BigDecimal(300));
        System.out.println("after transfer:");
        System.out.println("SAVING: " + bankService.getAmount(Account.Type.SAVING));
        System.out.println("CHEQUE: " + bankService.getAmount(Account.Type.CHEQUE));

    }
}
