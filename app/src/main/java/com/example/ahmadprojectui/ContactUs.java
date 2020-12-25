package com.example.ahmadprojectui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ContactUs extends AppCompatActivity {
    Button calls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactus);

   calls=findViewById(R.id.button22);
   calls.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent i=new Intent(ContactUs.this,Contactcall.class);
           startActivity(i);
       }
   });

    }

}