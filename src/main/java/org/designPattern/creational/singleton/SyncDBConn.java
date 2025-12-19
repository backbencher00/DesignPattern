package org.designPattern.creational.singleton;

//multithreaded
    public class SyncDBConn {
        private static SyncDBConn dbConnection = null;
        private SyncDBConn() {
        }

        /**
         * This will work in multithreaded ENV.
         * PROBLEMS -- because I am taking lock on complete method, it will hamper performace.
         * @return SyncDBConn
         */
        public static synchronized SyncDBConn createInstance(){
            if(dbConnection == null){
                dbConnection = new SyncDBConn();
            }
            return dbConnection;
        }
    }