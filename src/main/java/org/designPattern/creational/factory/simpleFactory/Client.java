package org.designPattern.creational.factory.simpleFactory;

public class Client {
    public static void main(String[] args) {

        CommunicationFactory factory = new CommunicationFactory();

        Communication communication = factory.getCommunication(CommunicationType.MOBILE);
        communication.sendCommunication();
    }

}
