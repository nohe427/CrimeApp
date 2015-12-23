package com.bignerdranch.andrid.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by alex7370 on 12/14/2015.
 */
public class Crime {
    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;

    public String getTitle() {
        return mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getID() {
        return mID;
    }

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        //Generate unique identifier
        mID = id;
        mDate = new Date();
        mTitle = "new title";
        mSolved = false;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }
}
