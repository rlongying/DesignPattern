package com.pattern.state;

public class PremiumCustomerState implements CustomerState{
    @Override
    public void applyDiscount(Customer customer) {
        customer.setDiscount(0.6);
    }

    @Override
    public String toString() {
        return "Premium Customer";
    }
}
