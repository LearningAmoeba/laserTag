package com.example.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivityImageButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_image_button);
        ImageButton startButton = (ImageButton)findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), userLoginPage .class);
                startIntent.putExtra("org.mentorschools.quicklauncher.SOMETHING", "HELLOW WORLD");
                startActivity(startIntent);
            }
        });
    }
}
