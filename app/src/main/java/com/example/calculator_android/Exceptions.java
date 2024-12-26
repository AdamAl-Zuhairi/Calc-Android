package com.example.calculator_android;

import android.content.Context;
import android.widget.Toast;


public class Exceptions extends RuntimeException {
    private Context context;

    public Exceptions(Context context, String message) {
        super(message);
        this.context = context;
        showToast(message);
    }

    private void showToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static Exceptions divideByZero(Context context) {
        return new Exceptions(context, "Cannot divide by zero.");
    }

    public static Exceptions twoInputsRequired(Context context) {
        return new Exceptions(context, "The operation requires two inputs");
    }

    public static Exceptions invalidOperator(Context context) {
        return new Exceptions(context, "The operator does not exist");
    }

    public static Exceptions invalidOperation(Context context) {
        return new Exceptions(context, "The operation does not exist");
    }
}
