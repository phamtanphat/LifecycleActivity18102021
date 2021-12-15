package com.example.lifecycleactivity18102021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button mBtnSingleTop,mBtnSingleTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("BBB","Main3 : onCreate");

        mBtnSingleTop = findViewById(R.id.buttonLaunchModeSingleTop);
        mBtnSingleTask = findViewById(R.id.buttonLaunchModeSingleTask);

        mBtnSingleTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity3.class);
                startActivity(intent);
            }
        });

        mBtnSingleTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("BBB","Data new");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Main3 : onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Main3 : onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Main3 : onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Main3 : onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Main3 : onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Main3 : onRestart");
    }
}