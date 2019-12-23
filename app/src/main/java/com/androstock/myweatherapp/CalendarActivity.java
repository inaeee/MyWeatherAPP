package com.androstock.myweatherapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

public class CalendarActivity extends AppCompatActivity {

    CalendarView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendar = (CalendarView) findViewById(R.id.calendarView);
    }



    public void onButton1Clicked(View v){
        Intent intent=new Intent(CalendarActivity.this,TodoActivity.class);
        startActivity(intent);
    }


    public void onButton2Clicked(View v){
        Intent intent=new Intent(CalendarActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
