package com.praveen.session7assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // References View objects with layout views
        TextView welcomeTextView = findViewById(R.id.welcomeTextView);

        // Retrieves intent from MainActivity
        Intent loginIntent = getIntent();

        try {
            // Retrieves username from Intent.
            String username = loginIntent.getStringExtra("Username").toString();

            // Update UserName to Welcome TextView
            welcomeTextView.setText("Welcome, " + username);
        }
        catch(Exception ex) {
            Toast.makeText(this, "Error reading data from intent.", Toast.LENGTH_LONG).show();

        }
    }
}
