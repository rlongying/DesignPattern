package com.pattern.factory;

public class CheapKnifeFactory implements AbstractKnifeFactory {
    @Override
    public AbstractKnife createKnife() {
        return new CheapKnife();
    }
}
