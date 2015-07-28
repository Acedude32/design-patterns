package com.smulsky.patterns.proxy;

public interface Server {
    void getConnection() throws AccessDeniedException;

    void closeConnection();
}
