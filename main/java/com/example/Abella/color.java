package com.example.Abella;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class color extends AppCompatActivity {

    EditText colorText;
    TextView colorTitle, result;
    String red = "RED", green = "GREEN", blue = "BLUE", yellow = "YELLOW", black = "BLACK";
    String val_color = " ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
    }
    public void colorMethod()
    {
        result = findViewById(R.id.result_textView);
        colorText = findViewById(R.id.color_editText);
        colorTitle = findViewById(R.id.title_textView);
        val_color = colorText.getText().toString();

        if (val_color.equals("red") || val_color.equals("RED") || val_color.equals("Red"))
        {
            result.setText(red);
            result.setBackgroundColor(Color.RED);
            colorTitle.setBackgroundColor(Color.RED);
        }
        else if (val_color.equals("green") || val_color.equals("GREEN") || val_color.equals("Green"))
        {
            result.setText(green);
            result.setBackgroundColor(Color.GREEN);
            colorTitle.setBackgroundColor(Color.GREEN);
        }
        else if (val_color.equals("blue") || val_color.equals("BLUE") || val_color.equals("Blue"))
        {
            result.setText(blue);
            result.setBackgroundColor(Color.BLUE);
            colorTitle.setBackgroundColor(Color.BLUE);
        }
        else if (val_color.equals("yellow") || val_color.equals("YELLOW") || val_color.equals("Yellow"))
        {
            result.setText(yellow);
            result.setBackgroundColor(Color.YELLOW);
            colorTitle.setBackgroundColor(Color.YELLOW);
        }
        else
        {
            result.setText(black);
            result.setBackgroundColor(Color.BLACK);
            result.setTextColor(Color.WHITE);
            colorTitle.setBackgroundColor(Color.BLACK);
            colorTitle.setTextColor(Color.WHITE);
        }
    }
    public void submit(View v)
    {
        colorMethod();
    }
}