package com.pattern.decorator;

import java.math.BigDecimal;

public class MushroomTopping extends PizzaTopping {
    public MushroomTopping(IPizza pizza) {
        super(pizza, "mushroom", new BigDecimal(4));
    }
}
