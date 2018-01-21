package com.example.quinn.rehabit;

/**
 * Created by rasu on 1/20/18. and by Sassraka and by JudeJang7
 *
 * Creates the Object Event object. The underlying backbone of the app, it contains the name, time,
 * and extra events for each event and links to the visual interface of the app.
 */

import java.util.*;

public class EventObject {

    public String name;
    public String day;
    public String time;
    public boolean lights;
    public boolean temperature;
    public boolean stove;
    public boolean water;
    public List<String> extraEvent = new ArrayList<String>();
/*
    //Default; no subevents
    public EventObject(String nm, String day, String tm) {

        this.name = nm;
        this.day = day;
        this.time = tm;


    }
*/
    //Subevents: Change lighting, don't change thermostat, no extra events
    public EventObject(String nm, String day, String tm, boolean lights, boolean temperature, boolean stove, boolean water) {

        this.name = nm;
        this.day = day;
        this.time = tm;
        this.lights= lights;
        this.temperature = temperature;
        this.stove = stove;
        this.water = water;

    }
/*
    //Subevents: Change thermostat, don't change lights, no extra events
    public EventObject(String nm, String day, String tm, boolean sbEv, short temperature) {

        this.name = nm;
        this.day = day;
        this.time = tm;
        this.subEvents = sbEv;
        this.temperature= temperature;

    }

    //Subevents: Change lighting, Change thermostat, no extra events
    public EventObject(String nm, String day, String tm, boolean sbEv, boolean lights, short temperature) {

        this.name = nm;
        this.day = day;
        this.time = tm;
        this.subEvents = sbEv;
        this.lights = lights;
        this.temperature = temperature;

    }

    //Subevents: Change lighting, don't change thermostat, extra events
    public EventObject(String nm, String day, String tm, boolean sbEv, boolean lights, List<String> eventList) {

        this.name = nm;
        this.day = day;
        this.time = tm;
        this.subEvents = sbEv;
        this.lights= lights;
        this.extraEvent = eventList;

    }

    //Subevents: Change thermostat, don't change lights, extra events
    public EventObject(String nm, String day, String tm, boolean sbEv, short temperature, List<String> eventList) {

        this.name = nm;
        this.day = day;
        this.time = tm;
        this.subEvents = sbEv;
        this.temperature= temperature;
        this.extraEvent = eventList;

    }

    //Subevents: Change lighting, Change thermostat, extra events
    public EventObject(String nm, String day, String tm, boolean sbEv, boolean lights, short temperature, List<String> eventList) {

        this.name = nm;
        this.day = day;
        this.time = tm;
        this.subEvents = sbEv;
        this.lights = lights;
        this.temperature = temperature;
        this.extraEvent = eventList;

    }*/
    public String days(){
        return this.day;
    };
    //returns time as an int
    public int getTime() {

        String my_string = new String("12:30AM");

        String h = my_string.substring(0, 2);
        String m = my_string.substring(3, 5);
        String am_pm = my_string.substring(5, 7);

        int hours = Integer.parseInt(h);
        int minutes = Integer.parseInt(m);

        if (am_pm == "AM")
        {
            return (hours * 60) + minutes;
        }
        else
        {
            return (12 * hours * 60) + minutes;
        }
    }
    }
