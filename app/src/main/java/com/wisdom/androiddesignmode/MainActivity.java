package com.wisdom.androiddesignmode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
