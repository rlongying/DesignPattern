package com.pattern.state;

public class Customer {
    private double discount;
    private CustomerState state = new NewCustomerState();

    public void applyDiscount() {
        this.state.applyDiscount(this);
    }

    public CustomerState getState() {
        return state;
    }

    public void setState(CustomerState state) {
        this.state = state;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
