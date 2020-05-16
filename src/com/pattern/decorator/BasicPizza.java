package com.pattern.decorator;

import java.math.BigDecimal;

public class BasicPizza implements IPizza{
    private BigDecimal price = new BigDecimal(5);

    @Override
    public BigDecimal getTotalPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BasicPizza";
    }
}
