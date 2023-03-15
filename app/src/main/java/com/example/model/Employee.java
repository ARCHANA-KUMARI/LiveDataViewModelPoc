package com.example.model;

import androidx.annotation.NonNull;

/**
 * @Author: Archana Kumari
 * @Date: 15-03-2023
 */
public class Employee {
    private String mName;
    private String mId;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    @NonNull
    @Override
    public String toString() {
        return " Employee Name:" + mName + " Employee ID:" + mId;
    }
}
