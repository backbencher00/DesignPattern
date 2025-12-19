package org.designPattern.creational.singleton;

//double check multithreaded
public class DoubleCheckDBConn {
    private static DoubleCheckDBConn dbConnection = null;
    private DoubleCheckDBConn() {
    }

    public static DoubleCheckDBConn createInstance(){
        if(dbConnection ==null){
            synchronized (DoubleCheckDBConn.class){
                if(dbConnection ==null){
                    dbConnection = new DoubleCheckDBConn();
                }
            }
        }
        return dbConnection;
    }
}