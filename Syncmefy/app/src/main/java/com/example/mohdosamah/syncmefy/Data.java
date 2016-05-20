package com.example.mohdosamah.syncmefy;

/**
 * Created by Shikhar on 18/05/16.
 */
public class Data {
    long timestamp;
    long maxLag;
    bool play;
    public Data(long T_stamp,long maxLag,bool turnOn) {
        play = turnOn;
        timestamp = T_stamp;
        maxLag = maxLag;
    }
}
