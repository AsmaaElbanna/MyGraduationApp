package com.example.shefaaproject.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shefaaproject.R;
import com.google.firebase.auth.FirebaseAuth;

public class SettingsActivity extends AppCompatActivity {
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        fAuth = FirebaseAuth.getInstance();

        if(fAuth.getCurrentUser() == null){
            finish();
            System.exit(0);
            int pid = android.os.Process.myPid();
            android.os.Process.killProcess(pid);
        }

        //move to change profile activity
        Button changeProfileButton = findViewById(R.id.change_profile_btn);
        changeProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getBaseContext() , ProfileActivity.class);
                startActivity(intent);
            }
        });
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();//logout
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
        finish();
    }
}