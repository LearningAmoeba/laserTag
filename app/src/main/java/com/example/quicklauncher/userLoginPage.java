package com.example.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class userLoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login_page);
        ImageButton logInButton = (ImageButton)findViewById(R.id.logIn);
        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logInIntent = new Intent(getApplicationContext(),playPage.class);
                startActivity(logInIntent);
            }
        });
        }
    }

