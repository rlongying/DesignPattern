package com.pattern.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * the proxy delegate the handle request function of an actual server
 */
public class WebServerProxy implements IServer{
    private List<WebServer> servers = new ArrayList<>();

    @Override
    public void handRequest(String request) {
        // security check
        // authentication
        // bla...bla...bla...
        for (WebServer server : servers) {
            if (server.isAvailable()) {
                server.handRequest(request);
                break;
            }
        }
    }
}
