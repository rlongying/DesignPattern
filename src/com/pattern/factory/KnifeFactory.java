package com.pattern.factory;

public class KnifeFactory {
    public static AbstractKnife createKnife(AbstractKnifeFactory factory) {
        return factory.createKnife();
    }
}
