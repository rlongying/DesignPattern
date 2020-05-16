package com.pattern.proxy;

public class WebServer implements IServer {

    @Override
    public void handRequest(String request) {
        // handle request
    }

    public boolean isAvailable() {
        return true;
    }
}
