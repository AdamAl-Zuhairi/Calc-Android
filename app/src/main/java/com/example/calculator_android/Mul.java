package com.example.calculator_android;

public class Mul implements MultipleOperand {
    public double execute(double operand1, Double operand2){
        if (operand2 == null) throw new IllegalArgumentException("Multiplication requires two operands.");
        return operand1*operand2;
    }
}
