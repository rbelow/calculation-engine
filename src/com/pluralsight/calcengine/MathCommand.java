package com.pluralsight.calcengine;

// use `MathCommand` only package internally: if somebody that is using your package starts to use this enumeration
// you risk to break their code if you make changes in `MathCommand`
enum MathCommand {
    Add,
    Subtract,
    Multiply,
    Divide
}
