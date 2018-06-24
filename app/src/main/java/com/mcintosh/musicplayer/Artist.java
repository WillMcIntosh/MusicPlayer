package com.mcintosh.musicplayer;

/**
 * provides artist for use in other classes
 */
public class Artist {
    private String mName;
    // Drawable resource ID
    private int mImageResourceId;

    public Artist(String name, int imageResourceId) {
        mName = name;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }
}
