package com.wisdom.androiddesignmode.abstractFactory;

public class ConcreteFactoryB extends AbstractFactory {
    @Override
    public IProductA getProductA() {
        return new ProductA2();
    }

    @Override
    public IProductB getProductB() {
        return new ProductB1();
    }
}
