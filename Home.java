
package com.example.quinn.rehabit;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.w3c.dom.Text;

import static com.example.quinn.rehabit.R.id.withText;

public class Home extends AppCompatActivity {

    // 0: monday 1:tuesday 2:wed 3: thurs 4:fri 5: sat 6: sun
    static List<List<EventObject>> weekdays = new ArrayList<List<EventObject>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        for(int i=0;i<=7;i++){
            // may cause its item to all be the same array
            weekdays.add( new ArrayList<EventObject>());
        }
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_WEEK);
        Date date = cal.getTime();
        Log.i("hi", Integer.toString(day));
        Log.i("hi", new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime()));

        EventObject testEvent = new EventObject("Wake up", "Sun,","10:20AM", false, false, true, false);
        weekdays.get(0).add(testEvent);
        //Context context;
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        /*
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(context);
                .setSmallIcon(R.drawable.notification_icon)
                .setContentTitle("My notification")
                .setContentText("Hello World!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        */

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setImageResource(R.drawable.plus);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //should bring up new event window
                Intent intent = new Intent(getBaseContext(), NewEventActivity.class);
                startActivity(intent);


               //Snackbar.make(view, "why", Snackbar.LENGTH_LONG)
               //         .setAction("Action", null).show();
            }
        });
    }

    public static String makedays(boolean mon,boolean tue,boolean wed,boolean thu,boolean fri,boolean sat,boolean sun){
        String tempstring="";
        if(mon != false){
            tempstring += "Mon,";
        }
        if(tue != false){
            tempstring += "Tue,";
        }
        if(wed != false){
            tempstring += "Wed,";
        }
        if(thu != false){
            tempstring += "Thu,";
        }
        if(fri != false){
            tempstring += "Fri,";
        }
        if(sat != false){
            tempstring += "Sat,";
        }
        if(sun != false){
            tempstring += "Sun";
        }
        return tempstring;
    }

    public static List<List<EventObject>> inputplace(EventObject eo){

        String tempstring = eo.days();
        List<String> abvdays = Arrays.asList(tempstring.split(","));
        //String[] abvdays = tempstring.split(",");
        for(int i=0;i <= abvdays.size();i++){

            if(abvdays.get(i)== "Mon"){
                Home.weekdays.get(0).add(eo);
            }
            else if(abvdays.get(i)== "Tue"){
                Home.weekdays.get(1).add(eo);
            }
            else if(abvdays.get(i)== "Wed"){
                Home.weekdays.get(2).add(eo);
            }
            else if(abvdays.get(i)== "Thu"){
                Home.weekdays.get(3).add(eo);
            }
            else if(abvdays.get(i)== "Fri"){
                Home.weekdays.get(4).add(eo);
            }
            else if(abvdays.get(i)== "Sat"){
                Home.weekdays.get(5).add(eo);
            }
            else if(abvdays.get(i)== "Sun"){
                Home.weekdays.get(6).add(eo);
            }
            else continue;
        }


        return weekdays;
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        // if (id == R.id.action_settings) {

        //TextView testString = (TextView) findViewById(withText);

        //testString.setText("does this work");

        //return true;

        //}

        return super.onOptionsItemSelected(item);
    }

}
