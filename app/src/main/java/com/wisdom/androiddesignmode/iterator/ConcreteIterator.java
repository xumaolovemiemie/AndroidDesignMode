package com.wisdom.androiddesignmode.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator {
    private int position;
    private List list;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position != list.size();
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = this.list.get(position++);
        }
        return obj;
    }
}
