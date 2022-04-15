package com.example.earthquake;

public class Earthquake {
    /** Time of the earthquake */
    private long mTimeInMilliseconds;
    private  double mMagnitude;
    private String mLocation;
    private String mUrl;

//    private String mTime;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() { return mUrl; }
}
