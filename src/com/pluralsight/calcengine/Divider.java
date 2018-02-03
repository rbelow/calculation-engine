package com.pluralsight.calcengine;

public class Divider extends CalculateBase {
    public Divider() {} // we need to provide a no-argument constructor because of we have other constructors in this class
    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal); // access base class constructors
    }

    @Override
    public void calculate() {
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
