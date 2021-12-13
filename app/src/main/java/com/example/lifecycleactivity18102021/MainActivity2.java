package com.example.lifecycleactivity18102021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("BBB","Main2 : onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Main2 : onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Main2 : onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Main2 : onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Main2 : onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Main2 : onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Main2 : onRestart");
    }
}