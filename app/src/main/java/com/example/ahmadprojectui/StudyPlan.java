package com.example.ahmadprojectui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StudyPlan extends AppCompatActivity {
    Button one, back ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studyplan);
             back=findViewById(R.id.bcksim2);
             back.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Intent i=new Intent(StudyPlan.this,Home.class);
                     startActivity(i);
                 }
             });
          one=findViewById(R.id.Firstbtn);
          one.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(StudyPlan.this,Firstyear.class);
        startActivity(i);
    }
});

    }

}