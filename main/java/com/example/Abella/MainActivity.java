package com.example.Abella;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
//import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button imp_but, exp_but;
    String imp_message = "Welcome to Implicit";
    String exp_message = "Welcome to Explicit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for implicit intent
        imp_but = findViewById(R.id.imp_button);
        imp_but.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intImp = new Intent(getApplicationContext(), Implicit.class);
                startActivity(intImp);
                Toast.makeText(getApplicationContext(), imp_message, Toast.LENGTH_SHORT).show();
            }
        });
        //for explicit intent
        exp_but = findViewById(R.id.exp_button);
        exp_but.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intExp = new Intent(getApplicationContext(), Explicit.class);
                startActivity(intExp);
                Toast.makeText(getApplicationContext(), exp_message, Toast.LENGTH_SHORT).show();
            }
        }); 
    }

}