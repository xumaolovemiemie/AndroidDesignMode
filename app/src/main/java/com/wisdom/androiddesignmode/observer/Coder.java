package com.wisdom.androiddesignmode.observer;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer {
    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi," + name + ",网站更新内容了：" + arg);
    }
}
