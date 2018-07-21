package com.pluralsight.calcengine;

// a interface has no implementation, it is just a contract
public interface MathProcessing {
    // `SEPARATOR` constant
    String SEPARATOR = " ";

    // model for anything that implements operations
    String getKeyword(); // add

    char getSymbol(); // +

    double doCalculation(double leftVal, double rightVal);
}
