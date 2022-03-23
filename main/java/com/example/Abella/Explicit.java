package com.example.Abella;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Explicit extends AppCompatActivity {

    Button pal, vowel, stringCont, color;
    EditText text;
    TextView result;
    int count = 0;
    String str, rlt, valid;
    String true_pal = "Palindrome";
    String false_pal = "Not a Palindrome";
    String default_text = "Explicit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);

        //for palindrome
        pal = findViewById(R.id.pal_button);
        pal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text = findViewById(R.id.input_editText);
                valid = text.getText().toString();//For Validation
                result = findViewById(R.id.result_textView);
                str = text.getText().toString();
                boolean isPalindrome = true;

                if(valid.isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "No Input Given",
                        Toast.LENGTH_LONG).show();
                }
                else {
                    for (int i = 0; i < str.length() / 2; i++) {
                        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                            isPalindrome = false;
                            break;
                        }
                    }
                    if (isPalindrome) {
                        result.setText(true_pal);
                    } else {
                        result.setText(default_text);
                        Toast.makeText(getApplicationContext(), false_pal,
                                Toast.LENGTH_SHORT).show();
                    }
                    result.setTextColor(Color.WHITE);
                }
            }
        });
        //for vowel
        vowel = findViewById(R.id.vowel_button);
        vowel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = findViewById(R.id.input_editText);
                valid = text.getText().toString();//For Validation
                result = findViewById(R.id.result_textView);
                str = text.getText().toString();

                str = str.toLowerCase();

                if(valid.isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "No Input Given",
                        Toast.LENGTH_SHORT).show();
                }
                else {
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                            count++;
                        }
                    }
                    rlt = String.valueOf(count);
                    result.setText(rlt);
                    count = 0;
                    result.setTextColor(Color.WHITE);
                }
            }
        });
        //for string
        stringCont = findViewById(R.id.string_button);
        stringCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = findViewById(R.id.input_editText);
                valid = text.getText().toString();//For Validation
                result = findViewById(R.id.result_textView);
                str = text.getText().toString();

                str = str.toLowerCase();
                if(valid.isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "No Input Given",
                        Toast.LENGTH_SHORT).show();
                }
                else {
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) != ' ') {
                            count++;
                        }
                    }
                    rlt = String.valueOf(count);
                    result.setText(rlt);
                    count = 0;
                    result.setTextColor(Color.WHITE);
                }
            }
        });
        //for color
        color = findViewById(R.id.color_button);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = findViewById(R.id.input_editText);
                valid = text.getText().toString();//For Validation
                result = findViewById(R.id.result_textView);
                str = text.getText().toString();

                if(valid.isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "No Color Given",
                        Toast.LENGTH_SHORT).show();
                }
                else {
                    if (str.equals("red") || str.equals("RED") || str.equals("Red")) {
                        result.setText(str);
                        result.setTextColor(Color.RED);
                    } else if (str.equals("green") || str.equals("GREEN") || str.equals("Green")) {
                        result.setText(str);
                        result.setTextColor(Color.GREEN);
                    } else if (str.equals("blue") || str.equals("BLUE") || str.equals("Blue")) {
                        result.setText(str);
                        result.setTextColor(Color.BLUE);
                    } else if (str.equals("yellow") || str.equals("YELLOW") || str.equals("Yellow")) {
                        result.setText(str);
                        result.setTextColor(Color.YELLOW);
                    } else {
                        result.setText(str);
                        result.setTextColor(Color.BLACK);
                    }
                }
            }
        });
    }
}
    /*
    //for palindrome activity
    public void submit_pal(View v)
    {
        text = findViewById(R.id.input_editText);
        result = findViewById(R.id.result_textView);
        str = text.getText().toString();
        boolean isPalindrome = true;

        for(int i = 0; i < str.length()/2; i++)
        {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i))
            {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
        {
            result.setText(true_pal);
        }
        else
        {
            result.setText(default_text);
            Toast.makeText(getApplicationContext(), false_pal, Toast.LENGTH_LONG).show();
        }
        result.setTextColor(Color.GRAY);
    }
    //for vowel activity
    public void submit_vowel(View v)
    {
        text = findViewById(R.id.input_editText);
        result = findViewById(R.id.result_textView);
        str = text.getText().toString();

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        rlt = String.valueOf(count);
        result.setText(rlt);
        count = 0;
        result.setTextColor(Color.GRAY);
    }
    //for string activity
    public void submit_string(View v)
    {
        text = findViewById(R.id.input_editText);
        result = findViewById(R.id.result_textView);
        str = text.getText().toString();

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
        result.setTextColor(Color.GRAY);
    }
    //for color activity
    public void submit_color(View v)
    {
        text = findViewById(R.id.input_editText);
        result = findViewById(R.id.result_textView);
        str = text.getText().toString();

        if (str.equals("red") || str.equals("RED") || str.equals("Red"))
        {
            result.setText(str);
            result.setTextColor(Color.RED);
        }
        else if (str.equals("green") || str.equals("GREEN") || str.equals("Green"))
        {
            result.setText(str);
            result.setTextColor(Color.GREEN);
        }
        else if (str.equals("blue") || str.equals("BLUE") || str.equals("Blue"))
        {
            result.setText(str);
            result.setTextColor(Color.BLUE);
        }
        else if (str.equals("yellow") || str.equals("YELLOW") || str.equals("Yellow"))
        {
            result.setText(str);
            result.setTextColor(Color.YELLOW);
        }
        else
        {
            result.setText(str);
            result.setTextColor(Color.BLACK);
        }
    }*/
    /*
        pal = findViewById(R.id.pal_button);
        pal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i = new Intent(getApplicationContext(), palindrome.class);
                startActivity(i);
            }
        });
        //for vowel counter activity
        vowel = findViewById(R.id.vowel_button);
        vowel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(), vowel.class);
                startActivity(i);
            }
        });
        //for string counter activity
        stringCont = findViewById(R.id.string_button);
        stringCont.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(), stringCont.class);
                startActivity(i);
            }
        });
        //for color activity
        color = findViewById(R.id.color_button);
        color.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(), color.class);
                startActivity(i);
            }
        });*/