package com.wisdom.androiddesignmode.singleton;

import java.io.ObjectStreamException;

public class Singleton1 {
    private static final Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    private Object  readResolve() throws ObjectStreamException{
        return instance;
    }
}
