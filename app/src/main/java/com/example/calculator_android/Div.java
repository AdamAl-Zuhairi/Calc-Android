package com.example.calculator_android;

public class Div implements MultipleOperand{
    public double execute(double operand1, Double operand2){
        if(operand2 == 0){
            //throw Exceptions.divideByZero();
            throw new IllegalArgumentException("Cannot divide by zero: TEMP EXCEPTION");
        }
        if (operand2 == null){
            //throw Exceptions.twoInputsRequired();
            throw new IllegalArgumentException("Needs two inputs: TEMP EXCEPTION");
        }
        return operand1/operand2;
    }
}
