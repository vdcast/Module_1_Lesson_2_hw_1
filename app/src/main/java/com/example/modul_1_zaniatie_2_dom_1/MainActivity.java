package com.example.modul_1_zaniatie_2_dom_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 17;
        int b = 12;
        int result;

        result = a + b;
        Log.d("MYLOG", "int +: " + String.valueOf(result));

        result = a - b;
        Log.d("MYLOG", "int -: " + String.valueOf(result));

        result = a * b;
        Log.d("MYLOG", "int *: " + String.valueOf(result));

        result = a / b;
        Log.d("MYLOG", "int /: " + String.valueOf(result));

        result = a % b;
        Log.d("MYLOG", "int %: " + String.valueOf(result));

        double a2 = 17;
        double b2 = 22;
        double result2 = a2 / b2;
        Log.d("MYLOG", "double /: " + String.valueOf(result2));
        double result3 = a2 % b2;
        Log.d("MYLOG", "double %: " + String.valueOf(result3));

    }
}