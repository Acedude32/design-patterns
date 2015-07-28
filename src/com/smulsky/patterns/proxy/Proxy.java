package com.smulsky.patterns.proxy;

public class Proxy implements Server {
    private Server server;
    private String name = "Anto";

    @Override
    public void getConnection() throws AccessDeniedException {
        if (name.equals("Anton")) {
            if (server == null) {
                server = new ServerImpl();
            }
            server.getConnection();
        }  else{
            throw new AccessDeniedException();
        }
    }

    @Override
    public void closeConnection() {
        if (name.equals("Anton")) {
            if (server != null) {
                server.closeConnection();
            }
        }
    }
}
