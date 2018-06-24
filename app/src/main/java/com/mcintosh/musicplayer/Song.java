package com.mcintosh.musicplayer;

/**
 * Provides title and artist for use in other activities
 */
public class Song {
    private String mTitle;
    private String mArtist;
    // Drawable resource ID
    private int mImageResourceId;

    public Song(String title, String artist, int imageResourceId) {
        mTitle = title;
        mArtist = artist;
        mImageResourceId = imageResourceId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
