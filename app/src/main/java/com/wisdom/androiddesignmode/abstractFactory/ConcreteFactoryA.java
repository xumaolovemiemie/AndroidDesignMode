package com.wisdom.androiddesignmode.abstractFactory;

public class ConcreteFactoryA extends AbstractFactory {
    @Override
    public IProductA getProductA() {
        return new ProductA1();
    }

    @Override
    public IProductB getProductB() {
        return new ProductB2();
    }
}
