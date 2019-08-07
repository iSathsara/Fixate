package com.example.uitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class level3 extends AppCompatActivity {

    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        next = findViewById(R.id.next);
    }

    public void showNext(View view){

        Intent intent1;
        intent1 = new Intent(level3.this,level4.class);
        startActivity(intent1);
    }
}
