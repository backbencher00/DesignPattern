package org.designPattern.structural.flyweightAndDecorator.decorator;
//concrete class
public class MilkDecorator implements  Coffee{
    private Coffee coffee;
    private static final int milkCost = 30;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public int cost() {
        return coffee.cost() + milkCost;
    }

    @Override
    public String description() {
        return coffee.description() + ", milk";
    }

}
