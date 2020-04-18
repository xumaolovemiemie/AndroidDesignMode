package com.wisdom.androiddesignmode.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Command> orderList = new ArrayList<>();

    public void takeOrder(Command order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Command order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}