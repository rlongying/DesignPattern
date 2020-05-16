package com.pattern.adapter;

public class AdapterClient {
    public static void main(String[] args) {
        CoffeeMachineInterface touchScreen = new CoffeeTouchScreenAdapter(new OldCoffeeMachine());
        touchScreen.chooseFirstSelection();
        touchScreen.chooseSecondSelection();
    }
}
