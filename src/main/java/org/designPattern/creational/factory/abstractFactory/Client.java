package org.designPattern.creational.factory.abstractFactory;

public class Client {
    /**
     * basically in abstract factory we are reducing if else we afre using in factory class to get the communication
     * @param args
     */
    public static void main(String[] args) {

        CommunicationFactory emailFactory = new EmailFactory();
        Communication emailFactoryCommunication = emailFactory.createCommunication(); // this is to create respective factory
        emailFactoryCommunication.sendCommunication(); // send communication from that factory

        //-------------------------------------------------------
        CommunicationFactory smsFactor = new EmailFactory();

        Communication smsFactorCommunication = smsFactor.createCommunication(); // this is to create respective factory
        smsFactorCommunication.sendCommunication();
    }

}
