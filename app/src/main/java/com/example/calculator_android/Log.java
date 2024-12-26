package com.example.calculator_android;

public class Log implements SingleOperand{
    @Override
    public double execute(double operand) {
        return Math.log10(operand);
    }
}
