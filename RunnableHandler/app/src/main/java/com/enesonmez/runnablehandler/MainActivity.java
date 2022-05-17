package com.enesonmez.runnablehandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Runnable runnable;
    Handler handler;
    TextView textView;
    Button buttonStart;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        buttonStart = findViewById(R.id.button);
        number = 0;
        textView.setText(Integer.toString(number));
    }

    public void start(View view) {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                number++;
                textView.setText(Integer.toString(number));
                handler.postDelayed(runnable,1000);
            }
        };

        handler.post(runnable);
        buttonStart.setEnabled(false);
    }

    public void stop(View view) {
        buttonStart.setEnabled(true);
        handler.removeCallbacks(runnable);
        number = 0;
        textView.setText(Integer.toString(number));
    }
}