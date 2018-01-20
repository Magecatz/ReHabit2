package com.example.quinn.rehabit;

/**
 * Created by rasu on 1/20/18.
 */

public class EventObject {

    public String name;
    public String time;
    public boolean subEvents;
    public boolean lights;
    public short temperature;

    //Default; no subevents
    public EventObject(String nm, String tm) {

        this.name = nm;
        this.time = tm;
        this.subEvents = sbEv;

    }

    //Subevents: Change lighting, don't change thermostat
    public EventObject(String nm, String tm, boolean sbEv, boolean lights) {

        this.name = nm;
        this.time = tm;
        this.subEvents = sbEv;

    }

    //Subevents: Change thermostat, don't change lights
    public EventObject(String nm, String tm, boolean sbEv, short thermoTemp) {

        this.name = nm;
        this.time = tm;
        this.subEvents = sbEv;

    }

    //Subevents: Change lighting, Change thermostat
    public EventObject(String nm, String tm, boolean sbEv, boolean lights, short temperature) {

        this.name = nm;
        this.time = tm;
        this.subEvents = sbEv;

    }

    }
