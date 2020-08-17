package com.example.shefaaproject.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shefaaproject.BookSpecialization;
import com.example.shefaaproject.R;

public class BookActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        //move to book area activity
        Button bookAreaButton = findViewById(R.id.book_area_btn);
        bookAreaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getBaseContext() , BookAreaActivity.class);
                startActivity(intent);
            }
        });

        Button bookSpecialization = findViewById(R.id.book_specialist_btn);
        bookSpecialization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getBaseContext() , BookSpecialization.class);
                startActivity(intent);
            }
        });


        Button bookNameOfDoctor = findViewById(R.id.book_name_of_doctor_btn);
        bookNameOfDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getBaseContext() , BookNameOfDoctorActivity.class);
                startActivity(intent);
            }
        });

    }


}