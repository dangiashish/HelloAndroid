package com.codebyashish.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        if (intent != null){

            String key = intent.getStringExtra("key");


            Toast.makeText(this, key, Toast.LENGTH_LONG).show();

        }

    }
}