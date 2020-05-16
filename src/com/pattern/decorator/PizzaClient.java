package com.pattern.decorator;

public class PizzaClient {
    public static void main(String[] args) {
        IPizza pizza = new BasicPizza();
        System.out.println(pizza.toString() + ", price: " + pizza.getTotalPrice().doubleValue() + "  dollars");

        pizza = new TomatoTopping(pizza);
        System.out.println(pizza.toString() + ", price: " + pizza.getTotalPrice().doubleValue() + "  dollars");

        pizza = new MushroomTopping(pizza);
        System.out.println(pizza.toString() + ", price: " + pizza.getTotalPrice().doubleValue() + "  dollars");

        pizza = new BaconTopping(pizza);
        System.out.println(pizza.toString() + ", price: " + pizza.getTotalPrice().doubleValue() + "  dollars");
    }
}
