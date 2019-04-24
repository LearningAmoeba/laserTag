package com.example.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class playerScore extends AppCompatActivity {
    public static TextView data;
    ImageButton update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_score);

        update = (ImageButton)findViewById(R.id.updateScore);
        data = (TextView) findViewById(R.id.textView);
        Button ScoreBoard = (Button)findViewById(R.id.returnToPlayPage );  // create a button
        ScoreBoard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ScoreBoard = new Intent(getApplicationContext(),playPage .class);
                startActivity(ScoreBoard);
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                receiveData process = new receiveData();
                process.execute();
            }
        });
    }
}
