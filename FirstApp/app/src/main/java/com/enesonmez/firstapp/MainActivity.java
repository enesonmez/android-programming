package com.enesonmez.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public int imageID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageID = 0;
    }

    public void changeImage(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        if(imageID != 1) {
            imageView.setImageResource(R.drawable.kemalsunal2);
            imageID = 1;
        }
        else {
            imageView.setImageResource(R.drawable.kemalsunal);
            imageID = 0;
        }
    }
}