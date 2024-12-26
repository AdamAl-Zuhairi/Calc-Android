package com.example.calculator_android;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorUIHandler {
    private Window calc;
    private EditText display;
    private String s0 = "", s1 = "", s2 = "";

    public CalculatorUIHandler(Activity activity) {
        // Initialisera kalkylatorlogik
        calc = new Window();

        // Hämta referenser till UI-komponenter från layouten
        display = activity.findViewById(R.id.display);

        // Ställ in knapphändelser för siffror
        int[] numberButtons = {R.id.button0, R.id.button1, R.id.button2, R.id.button3,
                R.id.button4, R.id.button5, R.id.button6, R.id.button7,
                R.id.button8, R.id.button9};

        for (int id : numberButtons) {
            Button button = activity.findViewById(id);
            button.setOnClickListener(v -> onNumberClick(((Button) v).getText().toString()));
        }

        // Ställ in knapphändelser för operatorer
        int[] operatorButtons = {R.id.addButton, R.id.subtractButton, R.id.multiplyButton, R.id.divideButton};
        for (int id : operatorButtons) {
            Button button = activity.findViewById(id);
            button.setOnClickListener(v -> onOperatorClick(((Button) v).getText().toString()));
        }

        // Ställ in knapphändelser för kontrollknappar
        activity.findViewById(R.id.clearButton).setOnClickListener(v -> onClearClick());
        activity.findViewById(R.id.equalButton).setOnClickListener(v -> onEqualClick());
        activity.findViewById(R.id.exitButton).setOnClickListener(v -> activity.finish());
    }

    private void onNumberClick(String number) {
        if (!s1.equals("")) {
            s2 += number;
        } else {
            s0 += number;
        }
        updateDisplay();
    }

    private void onOperatorClick(String operator) {
        if (!s0.equals("")) {
            s1 = operator;
        }
        updateDisplay();
    }

    private void onEqualClick() {
        if (!s0.equals("")) {
            double op1 = Double.parseDouble(s0);
            Double op2 = s2.isEmpty() ? null : Double.parseDouble(s2);
            double result = calc.calculate(op1, s1, op2);
            s0 = Double.toString(result);
            s1 = s2 = "";
            updateDisplay();
        }
    }

    private void onClearClick() {
        s0 = s1 = s2 = "";
        updateDisplay();
    }

    private void updateDisplay() {
        display.setText(s0 + s1 + s2);
    }
}
