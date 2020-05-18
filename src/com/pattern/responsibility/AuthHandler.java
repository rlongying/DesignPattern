package com.pattern.responsibility;

public class AuthHandler extends ServiceHandler {

    @Override
    public boolean handleRequest(String request) {
        if (!authenticated(request)) {
            return false;
        }
        System.out.println("authenticated ...");
        return checkNext(request);
    }

    private boolean authenticated(String request) {
        return true;
    }
}
