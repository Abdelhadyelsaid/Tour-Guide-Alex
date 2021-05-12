package com.example.tourguide;

public class Items {

    private int mName;
    private int mDescription;
    private int mImage;

    public Items(int Name, int Description, int image) {
        mName = Name;
        mDescription = Description;
        mImage = image;
    }

    public int getmName() {
        return mName;
    }

    public int getmDescription() {
        return mDescription;
    }

    public int getmImage() {
        return mImage;
    }
}

