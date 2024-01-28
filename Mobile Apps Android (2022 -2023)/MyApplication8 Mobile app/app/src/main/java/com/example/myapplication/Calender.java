package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class Calender extends AppCompatActivity {
    CalendarView calendarView;
    TextView redDateText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);


        calendarView = findViewById(R.id.calendarView);
        redDateText = findViewById(R.id.textView3);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

                String myDate = dayOfMonth + "/" + (month +1) +  "/" + year; // note the months start at 0

                redDateText.setText(myDate);

            }
        });
    }
}