package org.designPattern.creational.factory.simpleFactory;

public class Mobile implements Communication {

    @Override
    public void sendCommunication() {
        System.out.println("send communication through mobile");
    }


}
