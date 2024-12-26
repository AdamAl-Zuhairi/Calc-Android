package com.example.calculator_android;

public class Add implements MultipleOperand{
    public double execute(double operand1, Double operand2){
        if (operand2 == null) throw new IllegalArgumentException("Addition requires two operands: TEMP EXCEPTION");
        return operand1 + operand2;
    }
}
