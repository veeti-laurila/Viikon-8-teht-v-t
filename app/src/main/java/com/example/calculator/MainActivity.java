package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numberOne;
    private EditText numberTwo;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOne = findViewById(R.id.EditTextNumberOne);
        numberTwo = findViewById(R.id.EditTextNumberTwo);
        result = findViewById(R.id.TextViewResult);
    }

    public int getNumberOne() {
        String stringNumber1 = numberOne.getText().toString();
        int number1 = Integer.parseInt(stringNumber1);
        return number1;
    }

    public int getNumberTwo() {
        String stringNumber2 = numberTwo.getText().toString();
        int number2 = Integer.parseInt(stringNumber2);
        return number2;
    }

    public void addition(View view) {
        int addition = 0;
        addition = getNumberOne() + getNumberTwo();

        result.setText(Integer.toString(addition));
    }

    public void subtraction(View view) {
        int subtraction = 0;
        subtraction = getNumberOne() - getNumberTwo();

        result.setText(Integer.toString(subtraction));
    }

    public void multiplication(View view) {
        int multiplication = 0;
        multiplication = getNumberOne() * getNumberTwo();

        result.setText(Integer.toString(multiplication));
    }

    public void division(View view) {
        int division = 0;
        division = getNumberOne() / getNumberTwo();

        result.setText(Integer.toString(division));
    }
}