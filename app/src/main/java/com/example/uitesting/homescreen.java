package com.example.uitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homescreen extends AppCompatActivity {

    Button play;
    Button score;
    Button settings;
    Button how;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        play = findViewById(R.id.exit);
        score = findViewById(R.id.buttonScore);
        settings = findViewById(R.id.buttonSettings);
        how = findViewById(R.id.buttonhow);

    }

    public void showLevel1(View v){

        Intent intent1;
        intent1 = new Intent(homescreen.this,level1.class);
        startActivity(intent1);

    }

    public void showScore(View v){

        Intent intent2;
        intent2 = new Intent(homescreen.this,scorebord.class);
        startActivity(intent2);

    }

    public void showHowToPlay(View v){

        Intent intent3;
        intent3 = new Intent(homescreen.this,howtoplay.class);
        startActivity(intent3);

    }

    public void showSettings(View v){

        Intent intent4;
        intent4 = new Intent(homescreen.this,settings_ui.class);
        startActivity(intent4);

    }
}
