package com.pattern.state;

public class NewCustomerState implements CustomerState {

    @Override
    public void applyDiscount(Customer customer) {
        customer.setDiscount(0.9);
    }

    @Override
    public String toString() {
        return "New Customer";
    }
}
