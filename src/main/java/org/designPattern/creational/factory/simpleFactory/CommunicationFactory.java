package org.designPattern.creational.factory.simpleFactory;

public class CommunicationFactory {

    public Communication getCommunication(CommunicationType type){
        if(CommunicationType.MOBILE.equals(type)){
            return new Mobile();
        }else if(CommunicationType.EMAIL.equals(type)){
            return new Email();
        }else {
            throw new RuntimeException("communication not found");
        }
    }
}
