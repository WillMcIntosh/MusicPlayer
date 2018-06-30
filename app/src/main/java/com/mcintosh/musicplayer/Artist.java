package com.mcintosh.musicplayer;

/**
 * provides artist for use in other classes
 */
public class Artist {
    private String mArtist;
    // Drawable resource ID
    private int mImageResourceId;

    public Artist(String artist, int imageResourceId) {
        mArtist = artist;
        mImageResourceId = imageResourceId;
    }

    public String getArtist() {
        return mArtist;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}

