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
        //Generate unique identifier
        mID = UUID.randomUUID();
        mDate = new Date();
    }
}
