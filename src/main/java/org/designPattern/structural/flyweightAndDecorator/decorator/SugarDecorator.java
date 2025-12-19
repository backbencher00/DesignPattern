package org.designPattern.structural.flyweightAndDecorator.decorator;
//concrete class
public class SugarDecorator implements Coffee {
    private Coffee coffee;
    private static final int SugarCost = 10;
    public SugarDecorator(Coffee c){
        this.coffee = c;
    }
    @Override
    public int cost() {
        return coffee.cost() + SugarCost;
    }

    @Override
    public String description() {
        return coffee.description() + ", sugar";
    }
}
