package com.example.calculator_android;

public class Sqrt implements SingleOperand{
    public double execute(double operand) {
        return Math.sqrt(operand);
    }
}
