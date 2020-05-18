package com.pattern.responsibility;

public abstract class ServiceHandler {
    private ServiceHandler next;

    /**
     * override to implement specialized way of handling a request
     * @param request request
     * @return true if request is properly handled
     */
    public abstract boolean handleRequest(String request);

    /**
     * pass on the request to next handler in the chain
     * @param request
     * @return
     */
    protected boolean checkNext(String request) {
        if (next == null) {
            return true;
        }

        return next.handleRequest(request);
    }

    /**
     * binding next handler
     * @param next next service handler
     * @return a reference to next service handler
     */
    protected ServiceHandler addNextHandler(ServiceHandler next) {
        this.next = next;
        return next;
    }
}
