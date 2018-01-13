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
    private Double mMagnitude;

    // Time of the Earthquake
    private Long mTimeInMilliseconds;

    //URL to USGS for each earthquake
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     * @param url is the USGS url associated with an earthquake list item
     */
    public Earthquake(Double magnitude, String location, Long timeInMilliseconds, String url)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
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
    public Double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the date when the earthquake occurred
     */
    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Get the USGS url for each earthquake listing
     */
    public String getUrl () {return mUrl;}
}
