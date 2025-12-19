package org.designPattern.creational.singleton;

//single threaded
public class SingleThreadDBConnection {
    private static SingleThreadDBConnection dbConnection = null;

    private SingleThreadDBConnection() {
    }

    public static SingleThreadDBConnection createInstance(){
        if(dbConnection == null){
            dbConnection = new SingleThreadDBConnection();
        }
        return dbConnection;
    }
}