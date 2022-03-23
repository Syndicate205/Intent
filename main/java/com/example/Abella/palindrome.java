package com.example.Abella;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class palindrome extends AppCompatActivity {

    EditText pal;
    TextView result;
    String str;
    String true_pal = "Palindrome";
    String false_pal = "Not a Palindrome";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);
    }
    public void palindrome()
    {
        pal = findViewById(R.id.pal_editText);
        result = findViewById(R.id.result_textView);
        str = pal.getText().toString();

        StringBuffer newStr = new StringBuffer();
        for(int i = str.length()-1; i >= 0 ; i--)
        {
            newStr = newStr.append(str.charAt(i));
        }
        if(str.equalsIgnoreCase(newStr.toString()))
        {
            result.setText(true_pal);
        }
        else
        {
            result.setText(false_pal);
        }
    }
    public void submit(View v)
    {
        palindrome();
    }
}