package org.designPattern.creational.factory.abstractFactory;

public class MobileFactory implements CommunicationFactory {
    @Override
    public Communication createCommunication() {
        return new Mobile();
    }
}
