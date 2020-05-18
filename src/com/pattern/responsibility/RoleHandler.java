package com.pattern.responsibility;

public class RoleHandler extends ServiceHandler {

    @Override
    public boolean handleRequest(String request) {
        if (!hasRole()) {
            return false;
        }
        System.out.println("has role...");
        return checkNext(request);
    }

    private boolean hasRole() {
        return true;
    }
}
