package com.pluralsight.calcengine;

public class CalculateHelper {
    MathCommand command;
    double leftValue;
    double rightValue;
    double result;

    public void process(String statement) {
        // add 1.0 2.0
        String[] parts = statement.split(" ");
        String commandString = parts[0]; // add
        leftValue = Double.parseDouble(parts[1]); // 1.0
        rightValue = Double.parseDouble(parts[2]); // 2.0

        // translate string command to math command
        setCommandFromString(commandString);

        // create appropriate calculate base derived class
        CalculateBase calculator = null;
        switch(command) {
            case Add:
                calculator = new Adder(leftValue, rightValue);
                break;
            case Subtract:
                calculator = new Subtracter(leftValue, rightValue);
                break;
            case Multiply:
                calculator = new Multiplier(leftValue, rightValue);
                break;
            case Divide:
                calculator = new Divider(leftValue, rightValue);
                break;
        }

        // perform calculation
        calculator.calculate();
        result = calculator.getResult();
    }

    private void setCommandFromString(String commandString) {
        // add -> MathCommand.Add

        // take enumeration value and convert it to a string
        if(commandString.equalsIgnoreCase(MathCommand.Add.toString()))
            command = MathCommand.Add;
        else if(commandString.equalsIgnoreCase(MathCommand.Subtract.toString()))
            command = MathCommand.Subtract;
        else if(commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;
        else if(commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
            command = MathCommand.Divide;

    }
}
