package com.pattern.singleton;

public class InstanceThreadSafe {
    private String status = "status initial";
    private static int count = 0;

    private InstanceThreadSafe() {
        status = "status ".concat(Integer.toString(count++));
    }

    public static InstanceThreadSafe getInstance() {
       return InstanceHolder.instance;
    }

    public String getStatus() {
        return status;
    }

    public int getCount() {
        return count;
    }

    private static class InstanceHolder {
        private static InstanceThreadSafe instance = new InstanceThreadSafe();
    }
}
