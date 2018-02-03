package com.pluralsight.calcengine;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode = 'a';
    private double result;

    public double getLeftVal() {return leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;} // `void` because this method doesn't return a value
    public double getRightVal() {return rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public char getOpCode() {return opCode;}
    public void setOpCode(char opCode) {this.opCode = opCode;}

    public double getResult() {return result;} // result is a read-only value

    // constructors
    public MathEquation(double v, double leftVal, char d) {};

    public MathEquation (char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode); // chain the first constructor. must be placed at the beginning of the constructor
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    // method overloading
    public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }

    public void execute(int leftVal, int rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();

        result = (int)result; // reassign result to an `int`. it prints as an double because it's stored as an double but with the correct `int` behaviour
    }

    // `execute()` is reasonably complex given the simple things we're doing. this type of code easily breaks when your enhancing or changing a program
    public void execute() {
        switch(opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal + rightVal;
                break;
            case 'd': // even if curly braces are not necessary it makes the code more readable
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d; // good programming practice: check if the divisor is zero
                break;
//            if(val2 != 0.0d)
//                result = val1 / val2;
//            else
//                result = 0.0d;
            case 'm':
                result = leftVal + rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break; // good programming practice
        }
    }
}
