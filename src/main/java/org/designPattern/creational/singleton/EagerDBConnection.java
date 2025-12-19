package org.designPattern.creational.singleton;

// Simple and initial version of singleton
public class EagerDBConnection {
    /**
     * 1. Instance is created immediately when the class is loaded into JVM memory (even before you call createInstance()).
     * 2. This is why it’s called Eager Initialization → it initializes early, at class load time.
     * 3. Advantage : Simple and thread-safe by default (class loading is synchronized internally by JVM).
     * 4. Disadvantage : Increase app start time and memory usage
     */
    private static EagerDBConnection dbConnection = new EagerDBConnection();

    private EagerDBConnection() {} //making constructor private
    public static EagerDBConnection createInstance() {
        return dbConnection;
    }

    /**
     * PROBLEM: many classes on app start could lead to increase in app start time.
     */

}