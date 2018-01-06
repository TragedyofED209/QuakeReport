package com.example.android.quakereport;

/**
 * Created by Russ on 12/30/2017.
 */

public class Earthquake {
    // Name of the Earthquake location
    private String mLocationName;

    // Earthquake magnitude
    private String mMagNumber;

    // When the earthquake occurred
    private String mDate;

    /*
    * Create a new Earthquake object.
    *
    * @param vLocation is the location of the Earthquake
    * @param vMag is the Magnitude of the Earthquake
    * @param vDate is the date when the earthquake occurred
    * */
    public Earthquake(String vMag, String vLocation, String vDate)
    {
        mMagNumber = vMag;
        mLocationName = vLocation;
        mDate = vDate;
    }

    /**
     * Get the location of the earthquake
     */
    public String getmLocationName() {
        return mLocationName;
    }

    /**
     * Get the Magnitude number
     */
    public String getmMagNumber() {
        return mMagNumber;
    }

    /**
     * Get the date when the earthquake occurred
     */
    public String getmDate() {
        return mDate;
    }


}
