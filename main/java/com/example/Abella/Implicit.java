package com.example.Abella;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class Implicit extends AppCompatActivity {

    EditText hr, min, msg;
    Button set;

    String str_hour, str_minute, str_message;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);



        set = findViewById(R.id.submit_button);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    hr = findViewById(R.id.hr_editText);
                    min = findViewById(R.id.min_editText);
                    msg = findViewById(R.id.msg_editText);

                    str_hour = hr.getText().toString();
                    str_minute = min.getText().toString();
                    if(str_hour.isEmpty() || str_minute.isEmpty()) {
                        Toast.makeText(getApplicationContext(),"No Input Given",
                                Toast.LENGTH_SHORT).show();
                    }
                    else {
                        int hour = Integer.parseInt(hr.getText().toString());
                        int minute = Integer.parseInt(min.getText().toString());
                        String message = msg.getText().toString();

                        try {
                            Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
                            intent.putExtra(AlarmClock.EXTRA_HOUR, hour);
                            intent.putExtra(AlarmClock.EXTRA_MINUTES, minute);

                            //Validation if user input a message or not
                            if (message.isEmpty()) {
                                intent.putExtra(AlarmClock.EXTRA_MESSAGE, "It's Morning");
                            } else {
                                intent.putExtra(AlarmClock.EXTRA_MESSAGE, message);
                            }
                            //Validation if user input the correct format
                            if (hour < 12 && minute < 60) {
                                startActivity(intent);
                            } else {
                                Toast.makeText(getApplicationContext(), "12 hour format only",
                                        Toast.LENGTH_LONG).show();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}


/*
                if(str_hour.isEmpty() || str_minute.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Input a Value",
                            Toast.LENGTH_LONG).show();
                }
                //msg = findViewById(R.id.msg_editText);

                str_hour = hr.getText().toString();
                str_minute = min.getText().toString();
                //str_message = msg.getText().toString();

                if(str_hour.isEmpty() || str_minute.isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Input a Value",
                            Toast.LENGTH_LONG).show();
                }
                else
                {


                    try {
                        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);

                        intent.putExtra(AlarmClock.EXTRA_HOUR, hour);
                        intent.putExtra(AlarmClock.EXTRA_MINUTES, minute);
                        intent.putExtra(AlarmClock.EXTRA_MESSAGE, "Hello");//str_message);

                        startActivity(intent);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
 */
/*
set = findViewById(R.id.submit_button);
        set.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {


                if(hr.toString().isEmpty() || min.toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Input a Value",
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    hour = Integer.parseInt(hr.getText().toString());
                    minute = Integer.parseInt(min.getText().toString());
                    message = msg.getText().toString();

                    Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                            .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                            .putExtra(AlarmClock.EXTRA_HOUR, hour)
                            .putExtra(AlarmClock.EXTRA_MINUTES, minute);

                    startActivity(intent);
                }
            }
        });
*/
/*
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);

        set = findViewById(R.id.submit_button);
        hr = findViewById(R.id.hr_editText);
        min = findViewById(R.id.msg_editText);
        msg = findViewById(R.id.min_editText);

        set.setOnClickListener(set_alarm);
    }

    View.OnClickListener set_alarm = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int hour = Integer.parseInt(hr.getText().toString());
            int minutes = Integer.parseInt(min.getText().toString());
            String message = msg.getText().toString();

            get_alarm(hour, minutes, message);
            Toast.makeText(getApplicationContext(), "Input Set", Toast.LENGTH_LONG).show();
        }
    };
    private void get_alarm(int hour, int minutes, String message)
    {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes);
        if(intent.resolveActivity(getPackageManager()) == null)
        {
            Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
        }
        else
        {
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Alarm Set to " +hour+ ":" +minutes+".",
                    Toast.LENGTH_SHORT).show();
        }
    }
 */