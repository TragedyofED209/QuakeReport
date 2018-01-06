package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Russ on 12/30/2017.
 */

public class Earthquake {
    // Name of the Earthquake location
    private String mLocation;

    // Earthquake magnitude
    private String mMagnitude;

    // Time of the Earthquake
    private Long mTimeInMilliseconds;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake(String magnitude, String location, Long timeInMilliseconds)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /**
     * Get the location of the earthquake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the Magnitude number
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the date when the earthquake occurred
     */
    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

}
