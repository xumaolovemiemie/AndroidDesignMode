package com.wisdom.androiddesignmode.singleton;

import java.io.ObjectStreamException;

public class Singleton4 {
    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    private Object  readResolve() throws ObjectStreamException {
        return getInstance();
    }
}
