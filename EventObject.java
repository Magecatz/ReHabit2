package com.example.quinn.rehabit;

/**
 * Created by rasu on 1/20/18. and by Sassraka
 *
 * Creates the Object Event object. the underlying backbone of the app, it contains the data that
 * is important to each event and links to the visual interface of the app.
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


    }

    //Subevents: Change lighting, don't change thermostat
    public EventObject(String nm, String tm, boolean sbEv, boolean lights) {

        this.name = nm;
        this.time = tm;
        this.subEvents = sbEv;
        this.lights= lights;

    }

    //Subevents: Change thermostat, don't change lights
    public EventObject(String nm, String tm, boolean sbEv, short temperature) {

        this.name = nm;
        this.time = tm;
        this.subEvents = sbEv;
        this.temperature= temperature;

    }

    //Subevents: Change lighting, Change thermostat
    public EventObject(String nm, String tm, boolean sbEv, boolean lights, short temperature) {

        this.name = nm;
        this.time = tm;
        this.subEvents = sbEv;
        this.lights = lights;
        this.temperature = temperature;

    }

    }
