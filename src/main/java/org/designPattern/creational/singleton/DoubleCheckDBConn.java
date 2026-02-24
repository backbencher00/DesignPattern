package org.designPattern.creational.singleton;

//double check multithreaded
public class DoubleCheckDBConn {
    private static DoubleCheckDBConn dbConnection = null;
    private DoubleCheckDBConn() {
    }

    public static DoubleCheckDBConn createInstance(){
        // if the connection is created we will be giving to any one asking it
        // but when connection is not created then we are going inside it
        if(dbConnection ==null){
            //at this point there might be chances that 2 thread will entre
            synchronized (DoubleCheckDBConn.class){
                // only one will entry as this is the critical section and it will create the object now
                // when the second one will come we should be checking if first thread will made it or not if it is not null
                // then we should not be goind inside it just return the instance
                if(dbConnection ==null){
                    dbConnection = new DoubleCheckDBConn();
                }
            }
        }
        return dbConnection;
    }
}