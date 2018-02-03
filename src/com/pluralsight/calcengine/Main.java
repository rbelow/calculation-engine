package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        // parallel arrays https://en.wikipedia.org/wiki/Parallel_array
//      double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//      double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
//      char[] opCodes = {'d', 's', 's', 'm'};
//      double[] results = new double[opCodes.length];

//	    double val1 = 100.0d;
//	    double val2 = 0.0d;
//	    double result;
//	    char opCode = 'd'; // https://en.wikipedia.org/wiki/Opcode

//      MathEquation testEquation = new MathEquation();
//      testEquation.execute();
//      System.out.print("test=");
//      System.out.println(testEquation.getResult());

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for(MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();

        // method overloading calls
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble, rightDouble);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

        equationOverload.execute(leftInt, rightInt);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

        // the system picks the best overload from the ones that are available
        equationOverload.execute((double)leftInt, rightInt);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());

        // manageability and maintainability. localization of responsibility using class inheritance. changing behaviors are
        // going to be much simpler in this environment as a result of having used inheritance and specialization in the derived classes
        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d, 92.0d),
                new Subtracter(225.0d, 17.0d),
                new Multiplier(11.0d, 3.0d)
        };

        for(CalculateBase calculator:calculators) {
            calculator.calculate();
            System.out.print("result=");
            System.out.println(calculator.getResult());
        }
    }

//    public static MathEquation create(double leftVal, double rightVal, char opCode) { // https://stackoverflow.com/questions/2649213/in-laymans-terms-what-does-static-mean-in-java
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }
}
