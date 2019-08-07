package com.example.uitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class level2_ui extends AppCompatActivity {

    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_ui);
        next = findViewById(R.id.next);
    }

    public void showNext(View view){

        Intent intent;
        intent = new Intent(level2_ui.this,level3.class);
        startActivity(intent);
    }
}
