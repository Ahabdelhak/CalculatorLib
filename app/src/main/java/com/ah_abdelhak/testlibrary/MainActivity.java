package com.ah_abdelhak.testlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ah_abdelhak.testutils.Calculator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator.Plus(3,4);
    }
}