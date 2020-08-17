package com.example.shefaaproject.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.shefaaproject.Fragments.LikeFragment;
import com.example.shefaaproject.Fragments.MainFragment;
import com.example.shefaaproject.Fragments.MoreFragment;
import com.example.shefaaproject.Fragments.OfferFragment;
import com.example.shefaaproject.R;
import com.example.shefaaproject.Fragments.TimeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        fAuth = FirebaseAuth.getInstance();

        if(fAuth.getCurrentUser() == null){
            finish();
            System.exit(0);
            int pid = android.os.Process.myPid();
            android.os.Process.killProcess(pid);
        }
        fragmentManager.beginTransaction().replace(R.id.place_holder,new MainFragment()).commit();
    }
    public void mainClick(View view) {
        fragmentManager.beginTransaction().replace(R.id.place_holder,new MainFragment()).commit();
    }

    public void offerClick(View view) {
        fragmentManager.beginTransaction().replace(R.id.place_holder,new OfferFragment()).commit();
    }

    public void timeClick(View view) {
        fragmentManager.beginTransaction().replace(R.id.place_holder,new TimeFragment()).commit();
    }

    public void likeClick(View view) {
        fragmentManager.beginTransaction().replace(R.id.place_holder,new LikeFragment()).commit();
    }

    public void moreClick(View view) {
        fragmentManager.beginTransaction().replace(R.id.place_holder,new MoreFragment()).commit();
    }
}