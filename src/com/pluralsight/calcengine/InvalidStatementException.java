package com.pluralsight.calcengine;

public class InvalidStatementException extends Exception {
    public InvalidStatementException(String reason, String statement) {
        // super class constructor
        super(reason + ": " + statement);
    }

    public InvalidStatementException(String reason, String statement, Throwable cause) {
        // super class constructor
        super(reason + ": " + statement, cause); // pass the cause
    }
}
