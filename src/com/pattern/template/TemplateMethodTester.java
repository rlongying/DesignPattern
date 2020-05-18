package com.pattern.template;

public class TemplateMethodTester {
    public static void main(String[] args) {
        BankAccount cheque = new ChequeAccount(500);
        BankAccount credit = new CreditAccount(500, 500);
        // two different accounts provide withdraw service in a consistent way
        // but detail implementations are different to meet different business requirements
        cheque.withdraw(400);
        credit.withdraw(400);
        cheque.withdraw(300);
        credit.withdraw(300);
    }

}
