package com.example.Abella;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class vowel extends AppCompatActivity {

    EditText vtext;
    int vcount = 0;
    String str;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vowel);
    }

    public void count(){
        result = findViewById(R.id.result_textView);
        vtext = findViewById(R.id.vowel_textView);
        String str = vtext.getText().toString();


    }
    public void submit(View v)
    {
        count();
    }
    public void clear(View V)
    {
        result.setText("");
        vtext.setText("");
    }

}