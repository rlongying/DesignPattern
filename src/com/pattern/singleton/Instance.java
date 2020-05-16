package com.pattern.singleton;


public class Instance {
    private String status = "status initial";
    private static Instance singleInstance = null;
    private static int count = 0;

    private Instance() {
        status = "status ".concat(Integer.toString(count));
        count += 1;
    }

    public static Instance getInstance() {
        // not thread safe
        if(null == singleInstance) {
            singleInstance = new Instance();
        }
        return singleInstance;
    }


    public synchronized int getCount() {
        return count;
    }


    public String getStatus() {
        return status;
    }
}
