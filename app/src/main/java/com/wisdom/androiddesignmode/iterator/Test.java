package com.wisdom.androiddesignmode.iterator;

public class Test {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("1");
        aggregate.add("2");
        aggregate.add("3");
        aggregate.add("4");
        aggregate.add("5");
        aggregate.add("6");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println("\n" + iterator.next());
        }
    }
}
