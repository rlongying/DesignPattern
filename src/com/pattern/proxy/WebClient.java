package com.pattern.proxy;

public class WebClient {
    public static void main(String[] args) {
        IServer server = new WebServerProxy();
        // it appeals to the client that the request is handled,
        // but the client doesn't need to care which server is available and will handle it
        server.handRequest("request");
    }
}
