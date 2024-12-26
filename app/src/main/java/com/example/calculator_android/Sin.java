package com.example.calculator_android;

public class Sin implements SingleOperand{
    public double execute(double operand) {
        return Math.sin(operand);
    }
}
