package com.example.ahmadprojectui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    Button Profile ,contactuss,StudyPlanbtn,Colleges,cllculater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        cllculater=findViewById(R.id.loginbtn);
        cllculater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,Callculater.class);
                startActivity(i);
            }
        });
        Colleges=findViewById(R.id.college);
        Colleges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,Colleges.class);
                startActivity(i);
            }
        });
        StudyPlanbtn=findViewById(R.id.StudyPlaneb);
        StudyPlanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,StudyPlan.class);
                startActivity(i);
            }
        });
        contactuss=findViewById(R.id.button8);
        contactuss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,ContactUs.class);
                startActivity(i);
            }
        });
          Profile=findViewById(R.id.button9);
          Profile.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
          Intent i=new Intent(Home.this,Profilep.class);
          startActivity(i);
    }
});


    }

}