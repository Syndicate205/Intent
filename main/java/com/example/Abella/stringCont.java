package com.example.Abella;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class stringCont extends AppCompatActivity {

    EditText text;
    TextView result;
    int count = 0;
    String rlt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_cont);
    }

    public void count (){
        result = findViewById(R.id.result_textView);
        text = findViewById(R.id.string_editText);
        String str = text.getText().toString();

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != ' ')
            {
                count++;
            }
        }
        rlt = String.valueOf(count);
        result.setText(rlt);
        count = 0;
    }
    public void submit(View v)
    {
        count();
    }
    public void clear(View V)
    {
        result.setText("");
        text.setText("");
    }
}