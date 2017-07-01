package com.example.ljean.ggcintercom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Predash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predash);
    }

    public void Profile(View view) {
        Intent dash2 = new Intent(Predash.this, Profile.class);
        startActivity(dash2);
    }

    public void Predash(View view){
        Intent dash3 = new Intent(Predash.this, Predash.class);
        startActivity(dash3);
    }

    public void Feedback(View view) {
        Intent dash3 = new Intent(Predash.this, Feedback.class);
        startActivity(dash3);
    }

    public void Alert(View view){
        Intent dash = new Intent(Predash.this, Alert.class);
        startActivity(dash);
    }


}
