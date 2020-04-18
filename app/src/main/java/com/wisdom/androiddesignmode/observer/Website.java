package com.wisdom.androiddesignmode.observer;

import java.util.Observable;

public class Website extends Observable {
    public void callCoder(String content) {
        setChanged();
        notifyObservers(content);
    }
}
