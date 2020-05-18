package com.pattern.responsibility;

public class VettedHandler extends ServiceHandler {

    @Override
    public boolean handleRequest(String request) {

        if (!vetted()) {
            return false;
        }

        System.out.println("Vetted role ...");

        return checkNext(request);
    }

    public boolean vetted() {
        return true;
    }
}
