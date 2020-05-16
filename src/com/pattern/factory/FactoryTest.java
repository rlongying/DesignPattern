package com.pattern.factory;


public class FactoryTest {
    public static void main(String[] args) {
        AbstractKnife k1 = KnifeFactory.createKnife(new QualityKnifeFactory());
        System.out.println(k1);

        AbstractKnife k2 = KnifeFactory.createKnife(new CheapKnifeFactory());
        System.out.println(k2);
    }
}
