
package com.example.quinn.rehabit;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

import org.w3c.dom.Text;

import static com.example.quinn.rehabit.R.id.withText;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 0: monday 1:tuesday 2:wed 3: thurs 4:fri 5: sat 6: sun
        List<List<EventObject>> weekdays = new ArrayList<List<EventObject>>();

        for(int i=0;i<=7;i++){
            // may cause its item to all be the same array
            weekdays.add( new ArrayList<EventObject>());


        }


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
    public List<List<EventObject>> inputplace(List<List<EventObject>> weekdays,EventObject eo){
        List<String> days = new ArrayList<String>();
        //String tempstring = EventObject.day;


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
