package com.example.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class userLoginPage extends AppCompatActivity {
    EditText userInfo;
    ImageButton logInButton;
    static String userLoginName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login_page);



        logInButton = (ImageButton)findViewById(R.id.logIn);

        userInfo = (EditText) findViewById(R.id.userName);



        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLoginName = userInfo.getText().toString();
                fetchData process = new fetchData();
                process.execute();
                Intent logInIntent = new Intent(getApplicationContext(),playPage.class);
                startActivity(logInIntent);
            }

        });
        }
        public static String getUserName(){
            return userLoginName;
        }

    }

