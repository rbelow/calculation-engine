package com.pluralsight.calcengine;

// this class acts as a common point of inheritance for all separate operations
// class must be `abstract` because of `calculate()`
public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;

    public double getLeftVal() {return leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;} // `void` because this method doesn't return a value
    public double getRightVal() {return rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public double getResult() {return result;}
    public void setResult(double result) {this.result = result;}

    // no-argument constructor
    public CalculateBase() {}
    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        // now we have all our value management
    }

    // `calculate()` is `abstract` because we do not have a single definition of `calculate()`
    public abstract void calculate();
}
