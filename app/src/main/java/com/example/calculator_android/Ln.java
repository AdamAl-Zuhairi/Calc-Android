package com.example.calculator_android;

public class Ln implements SingleOperand {
    @Override
    public double execute(double operand) {
        return Math.log(operand);
    }
}
