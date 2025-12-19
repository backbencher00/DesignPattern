package org.designPattern.creational.factory.abstractFactory;

public class EmailFactory implements CommunicationFactory {

    public Communication createCommunication() {
        return new Email();
    }
}
