package org.designPattern.structural.flyweightAndDecorator.decorator;

public class Client {
    public static void main(String[] args) {
        BasicCoffee basicCoffee = new BasicCoffee();
        Coffee putMilk = new MilkDecorator(basicCoffee);
        Coffee finalCoffee = new SugarDecorator((putMilk));

        System.out.println(finalCoffee.description());
        System.out.println(finalCoffee.cost());
    }
}
