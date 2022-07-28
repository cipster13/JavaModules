package factory.impl;

import factory.Factory;

public class NumberFactory implements Factory<Double> {

    @Override
    public Double generateSomething() {
        return Math.random();
    }
}
