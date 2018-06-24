package com.mcintosh.musicplayer;

/**
 * Provides title and artist for use in other activities
 */
public class Song {
    private String mTitle;
    private String mArtist;
    private String mAlbum;
    // Drawable resource ID
    private int mImageResourceId;

    public Song(String title, String artist, String album, int imageResourceId) {
        mTitle = title;
        mArtist = artist;
        mImageResourceId = imageResourceId;
        mAlbum = album;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
