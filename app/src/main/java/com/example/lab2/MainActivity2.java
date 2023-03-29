package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
   TextView recv_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recv_msg = (TextView) findViewById(R.id.textView);
        Intent intent=getIntent();
        String str = intent.getStringExtra("msg_key");

        recv_msg.setText("Hello"+str+"!");
    }
}