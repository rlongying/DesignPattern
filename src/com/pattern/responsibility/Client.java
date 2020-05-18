package com.pattern.responsibility;

public class Client {
    public static void main(String[] args) {
        // set up the first handler
        ServiceHandler handler = new AuthHandler();

        // add a chain of handler
        // the handler will handle the request in specified order
        // until it fails or processed by the last handler
        handler.addNextHandler(new RoleHandler()).addNextHandler(new VettedHandler());

        handler.handleRequest("request");
    }
}
