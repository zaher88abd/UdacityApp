package com.abd.zaher88.firstudacityapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void toastShow(String message) {
        Toast.makeText(MainActivity.this, "This Button will launch my" + message + " app!", Toast.LENGTH_SHORT).show();
    }

    public void btn1(View view) {
        toastShow("My Nanodegree Apps");
    }

    public void btn2(View view) {
        toastShow("POPULAR MOVIES");
    }

    public void btn3(View view) {
        toastShow("STACK HAWK");
    }

    public void btn4(View view) {
        toastShow("BUILD IT BIGGERS");
    }

    public void btn5(View view) {
        toastShow("MAKE YOUR APP MATERIAL");
    }

    public void btn6(View view) {
        toastShow("GO UBIQUITOUS");
    }

    public void btn7(View view) {
        toastShow("CAPSTONE");
    }
}
