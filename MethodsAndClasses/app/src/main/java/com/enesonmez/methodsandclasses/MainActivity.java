package com.enesonmez.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Activity Lifecycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("on create");

        testMethod();
        System.out.println(sumMath(5,87));

        createBook();
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop");
    }

    public void testMethod(){
        System.out.println("Test method");
    }

    public int sumMath(int a, int b){
        return a+b;
    }

    public void createBook(){
        // instance
        Books sefiller = new Books("Sefiller", "Can", 1890);
        System.out.println(sefiller.getName());
    }
}