package com.surcov.revisit.java.designPatterns.bridge;

public abstract class AbstractAccount {
    private Logger logger = new Info();

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    // the logging part is delegated to the Logger implementation
    protected void operate(String message, boolean result) {
        logger.log(message + " result " + result);
    }
}