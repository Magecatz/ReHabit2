package com.example.quinn.rehabit;

/**
 * Created by rasu on 1/20/18.
 */

public class EventObject {

    public String name;
    public String time;
    public boolean subEvents;
    public boolean lights;
    public boolean thermo;

    public EventObject(String nm, String tm, boolean sbEv) {

        this.name = nm;
        this.time = tm;
        this.subEvents = sbEv;

    }


}
