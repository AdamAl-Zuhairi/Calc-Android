package com.example.calculator_android;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public class Window {
    public Map<String, Op> operations;
    private Context context;
    String s0,s1,s2;

    Window() {
        this.context = context;
        s0 = s1 = s2 = "";
        operations = new HashMap<String, Op>();
        operations.put("+", new Add());
        operations.put("-", new Sub());
        operations.put("*", new Mul());
        operations.put("/", new Div());
        operations.put("^", new Pow());
        operations.put("log", new Log());
        operations.put("ln", new Ln());
        operations.put("sqrt", new Sqrt());
        operations.put("cos", new Cos());
        operations.put("sin", new Sin());
        operations.put("tan", new Tan());
    }
    
    public double calculate (double operand1, String operator, double operand2){
        Op currentOp = operations.get(operator);
        if(currentOp == null){
            throw Exceptions.invalidOperator(context);
        }
        if (currentOp instanceof SingleOperand) {
            return ((SingleOperand)currentOp).execute(operand1);
        }
        if(currentOp instanceof MultipleOperand) {
            return ((MultipleOperand)currentOp).execute(operand1, operand2);
        }
        else{
            throw Exceptions.invalidOperator(context);
        }
    }
}
