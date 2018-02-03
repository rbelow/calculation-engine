package com.pluralsight.calcengine;

public class Adder extends CalculateBase {
    public Adder() {}; // no-argument constructor
    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal); // access base class constructors
    }

    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal(); // base class methods
        setResult(value);
    }
}
