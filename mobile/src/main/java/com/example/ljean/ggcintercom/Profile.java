package com.example.ljean.ggcintercom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }


    public void SendingMessage (View view)
    {
        Intent signUp1 = new Intent(Profile.this, SendingMessage.class);
        startActivity(signUp1);
    }
}
