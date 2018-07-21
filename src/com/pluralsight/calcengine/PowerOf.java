package com.pluralsight.calcengine;

public class PowerOf implements MathProcessing {

    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^'; // why can not the char be inside double quotes?
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return Math.pow(leftVal, rightVal);
    }
}
