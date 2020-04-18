package com.wisdom.androiddesignmode.singleton;

import java.io.ObjectStreamException;

public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    private Object  readResolve() throws ObjectStreamException {
        return instance;
    }
}
