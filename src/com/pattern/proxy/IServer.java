package com.pattern.proxy;

public interface IServer {
    // to simplify the idea, ignore the structure of an actual request
    void handRequest(String request);
}
