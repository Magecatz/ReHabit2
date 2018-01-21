package com.example.quinn.rehabit;

/**
 * Created by rasu on 1/20/18. and by Sassraka
 *
 * Creates the Object Event object. The underlying backbone of the app, it contains the name, time,
 * and extra events for each event and links to the visual interface of the app.
 */

import java.util.*;

public class EventObject {

    public String name;
    public String time;
    public boolean subEvents;
    public boolean lights;
    public short temperature;
    public List<String> extraEvent = new ArrayList<String>();

    //Default; no subevents
    public EventObject(String nm, String tm) {

        this.name = nm;
        this.time = tm;


    }

    //Subevents: Change lighting, don't change thermostat, no extra events
    public EventObject(String nm, String tm, boolean sbEv, boolean lights) {

        this.name = nm;
        this.time = tm;
        this.subEvents = sbEv;
        this.lights= lights;

    }

    //Subevents: Change thermostat, don't change lights, no extra events
    public EventObject(String nm, String tm, boolean sbEv, short temperature) {

        this.name = nm;
        this.time = tm;
        this.subEvents = sbEv;
        this.temperature= temperature;

    }

    //Subevents: Change lighting, Change thermostat, no extra events
    public EventObject(String nm, String tm, boolean sbEv, boolean lights, short temperature) {

        this.name = nm;
        this.time = tm;
        this.subEvents = sbEv;
        this.lights = lights;
        this.temperature = temperature;

    }

    //Subevents: Change lighting, don't change thermostat, extra events
    public EventObject(String nm, String tm, boolean sbEv, boolean lights, List<String> eventList) {

        this.name = nm;
        this.time = tm;
        this.subEvents = sbEv;
        this.lights= lights;
        this.extraEvent = eventList;

    }

    //Subevents: Change thermostat, don't change lights, extra events
    public EventObject(String nm, String tm, boolean sbEv, short temperature, List<String> eventList) {

        this.name = nm;
        this.time = tm;
        this.subEvents = sbEv;
        this.temperature= temperature;
        this.extraEvent = eventList;

    }

    //Subevents: Change lighting, Change thermostat, extra events
    public EventObject(String nm, String tm, boolean sbEv, boolean lights, short temperature, List<String> eventList) {

        this.name = nm;
        this.time = tm;
        this.subEvents = sbEv;
        this.lights = lights;
        this.temperature = temperature;
        this.extraEvent = eventList;

    }

    }
