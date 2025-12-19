package org.designPattern.creational.factory.abstractFactory;

public class Mobile implements Communication {

    @Override
    public void sendCommunication() {
        System.out.println("send communication through mobile");
    }


}
