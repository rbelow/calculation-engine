package com.pluralsight.calcengine;

// `CalculateBase` could implement `MathProcessing` for al derived classes
public class Adder extends CalculateBase implements MathProcessing {
    public Adder() {}; // no-argument constructor
    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal); // access base class constructors
    }

    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal(); // base class methods
        setResult(value);
    }

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }
}
