package com.pattern.decorator;

import java.math.BigDecimal;

public class BaconTopping extends PizzaTopping {
    public BaconTopping(IPizza pizza) {
        super(pizza, "Bacon", new BigDecimal(5));
    }
}
