package org.designPattern.structural.flyweightAndDecorator.decorator;

public class BasicCoffee implements  Coffee{
    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String description() {
        return "Basic Coffee";
    }
}
