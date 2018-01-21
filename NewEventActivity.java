package com.example.quinn.rehabit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewEventActivity extends AppCompatActivity {
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    List<String> timeday = Arrays.asList("Mon","Tues","Wed","Thu","Fri","Sat","Sun");
    List<String> timehours = Arrays.asList("12","11","10","9","8","7","6","5","4","3","2","1") ;
    List<String> timemins= Arrays.asList("00","05","10","15","20","25","30","35","40","45","50","55");
    List<String> timeampm= Arrays.asList("am","pm");
    List<String> dropdown= Arrays.asList("Lights","temperature","Stove/Oven","Water");
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EditText EventName = (EditText) findViewById(R.id.EventName);
        final String text= EventName.getEditableText().toString();

        Button DeleteButton = (Button) findViewById(R.id.DeleteButton);
        DeleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        final CheckBox Monday = (CheckBox) findViewById(R.id.Monday);
        final CheckBox Tuesday = (CheckBox) findViewById(R.id.Tuesday);
        final CheckBox Wednesday = (CheckBox) findViewById(R.id.Wednesday);
        final CheckBox Thursday = (CheckBox) findViewById(R.id.Thursday);
        final CheckBox Friday = (CheckBox) findViewById(R.id.Friday);
        final CheckBox Saturday = (CheckBox) findViewById(R.id.Saturday);
        final CheckBox Sunday = (CheckBox) findViewById(R.id.Sunday);

        final CheckBox Lights = (CheckBox) findViewById(R.id.Lights);
        final CheckBox Thermostat = (CheckBox) findViewById(R.id.Thermostat);
        final CheckBox Stove = (CheckBox) findViewById(R.id.Stove);
        final CheckBox Water = (CheckBox) findViewById(R.id.Water);

        /*CheckBox Notifications = (CheckBox) findViewById(R.id.Notifications);
        Notifications.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //todo
            }
        });*/


        Button Submit = (Button) findViewById(R.id.Submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String days = Home.makedays(Monday.isChecked(), Tuesday.isChecked(), Wednesday.isChecked(), Thursday.isChecked(), Friday.isChecked(), Saturday.isChecked(), Sunday.isChecked());
                EventObject newEvent = new EventObject(text, days, "09:30AM", Lights.isChecked(), Thermostat.isChecked(), Stove.isChecked(), Water.isChecked());
                Home.inputplace(newEvent);

                Snackbar.make(view, days, Snackbar.LENGTH_LONG)
                         .setAction("Action", null).show();

                //finish();
            }
        });

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
}
