package com.enesonmez.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.editTextTextPersonName);
        number2Text = findViewById(R.id.editTextTextPersonName2);
        resultText = findViewById(R.id.textView);
    }

    public void sum(View view) {

        if (number1Text.getText().toString().isEmpty() || number2Text.getText().toString().isEmpty()) {
            resultText.setText("Enter Number!");
        } else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;
            resultText.setText("Result: " + result);
        }
    }

    public void subtraction(View view) {
        if (number1Text.getText().toString().isEmpty() || number2Text.getText().toString().isEmpty()) {
            resultText.setText("Enter Number!");
        } else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;
            resultText.setText("Result: " + result);
        }
    }

    public void multiply(View view) {
        if (number1Text.getText().toString().isEmpty() || number2Text.getText().toString().isEmpty()) {
            resultText.setText("Enter Number!");
        } else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;
            resultText.setText("Result: " + result);
        }
    }

    public void divide(View view) {
        if (number1Text.getText().toString().isEmpty() || number2Text.getText().toString().isEmpty()) {
            resultText.setText("Enter Number!");
        } else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 / number2;
            resultText.setText("Result: " + result);
        }
    }
}