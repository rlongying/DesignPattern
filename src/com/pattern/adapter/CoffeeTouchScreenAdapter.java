package com.pattern.adapter;

public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface {
    private OldCoffeeMachine oldCoffeeMachine;

    public CoffeeTouchScreenAdapter(OldCoffeeMachine oldCoffeeMachine) {
        this.oldCoffeeMachine = oldCoffeeMachine;
    }

    @Override
    public void chooseFirstSelection() {
        oldCoffeeMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        oldCoffeeMachine.selectB();
    }
}
