package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Earthquake {
    private String mMagnitude;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mLocation;

    // Drawable resource ID
    private long mTimeInMilliseconds;
    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public Earthquake(String vMagnitude, String vLocation, long mTimeInMilliseconds)
    {
        mMagnitude = vMagnitude;
        mLocation = vLocation;
        mTimeInMilliseconds = mTimeInMilliseconds;
    }

    /**
     * Get the name of the Android version
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the Android version number
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the image resource ID
     */
    public long getTimeInMilliseconds() {

        return mTimeInMilliseconds;
    }

}
