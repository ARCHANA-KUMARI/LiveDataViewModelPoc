package com.example.model;

import androidx.annotation.NonNull;

/**
 * @Author: Archana Kumari
 * @Date: 26-01-2023
 */
public class User {
    private String mName;
    private String mID;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    @NonNull
    @Override
    public String toString() {
        return "Name:" + mName + "ID:" + mID;
    }
}
