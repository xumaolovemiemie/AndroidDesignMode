package com.wisdom.androiddesignmode.singleton;

import java.io.ObjectStreamException;

public class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    private Object  readResolve() throws ObjectStreamException {
        return instance;
    }
}
