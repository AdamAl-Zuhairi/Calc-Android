package com.example.calculator_android;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class App extends AppCompatActivity {
    private CalculatorUIHandler calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        // Skapa instans av CalculatorUIHandler och koppla den till aktivitetslayouten
        calc = new CalculatorUIHandler(this);
    }
}
