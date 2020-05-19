package com.pattern.state;

public class StateTester {
    public static void main(String[] args) {
        // New state could be added without changing Customer
        // the "applyDiscount" function behaves differently according to the state of a customer
        Customer customer = new Customer();
        System.out.println( customer.getState());
        customer.applyDiscount();
        System.out.println(customer.getDiscount());
        customer.setState(new PremiumCustomerState());
        System.out.println(customer.getState());
        customer.applyDiscount();
        System.out.println(customer.getDiscount());
    }
}
