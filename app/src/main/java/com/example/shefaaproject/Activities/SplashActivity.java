package com.example.shefaaproject.Activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shefaaproject.R;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    checkIfUserIsLogged();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


    private void checkIfUserIsLogged() {

        //   TODO CHECK IF LOGGED IN DATABASE

        // signed in with google
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(SplashActivity.this);

        // signed in with fb
        AccessToken accessToken = AccessToken.getCurrentAccessToken();
        boolean isLoggedIn = accessToken != null && !accessToken.isExpired();

        if (!isLoggedIn && account == null) {
            goToLoginActivity();
        } else {
            openHomeActivity();
        }
    }

    private void goToLoginActivity() {
        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
        finish();
    }

    private void openHomeActivity() {
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }
}
