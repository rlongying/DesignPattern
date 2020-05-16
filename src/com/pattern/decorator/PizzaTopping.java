package com.pattern.decorator;

import java.math.BigDecimal;

public abstract class PizzaTopping implements IPizza{
    private IPizza pizza;
    private String name;
    private BigDecimal price;

    protected PizzaTopping(IPizza pizza, String name, BigDecimal price) {
        this.pizza = pizza;
        this.name = name;
        this.price = price;
    }

    @Override
    public BigDecimal getTotalPrice() {
        return price.add(pizza.getTotalPrice());
    }

    @Override
    public String toString() {
        return pizza.toString() + " + " + name;
    }
}
