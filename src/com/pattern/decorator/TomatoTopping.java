package com.pattern.decorator;

import java.math.BigDecimal;

public class TomatoTopping extends PizzaTopping{

    public TomatoTopping(IPizza pizza) {
        super(pizza, "Tomato", new BigDecimal(3));
    }
}
