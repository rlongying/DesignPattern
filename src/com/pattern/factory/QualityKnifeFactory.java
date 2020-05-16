package com.pattern.factory;

public class QualityKnifeFactory implements AbstractKnifeFactory {
    @Override
    public AbstractKnife createKnife() {
        return new QualityKnife();
    }
}
