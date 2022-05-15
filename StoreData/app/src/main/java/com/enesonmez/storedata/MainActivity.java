package com.enesonmez.storedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ageInput;
    TextView ageText;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ageInput = findViewById(R.id.editTextNumber);
        ageText = findViewById(R.id.textView);

        sharedPreferences = this.getSharedPreferences("com.enesonmez.storedata", Context.MODE_PRIVATE);
        String age = sharedPreferences.getString("age","?");
        ageText.setText("Your Age: " + age);
    }

    public void save(View view) {
        String text = ageInput.getText().toString();
        if (!text.isEmpty()) {
            ageText.setText("Your Age: " + text);
            sharedPreferences.edit().putString("age",text).apply();
        }
    }

    public void remove(View view) {
        String age = sharedPreferences.getString("age","?");

        if (age != "?"){
            sharedPreferences.edit().remove("age").apply();
            ageText.setText("Your Age: ?");
        }
    }
}