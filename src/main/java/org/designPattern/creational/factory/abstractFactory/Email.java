package org.designPattern.creational.factory.abstractFactory;

public class Email implements Communication {
    @Override
    public void sendCommunication() {
        System.out.println("send communication through email");
    }
}
