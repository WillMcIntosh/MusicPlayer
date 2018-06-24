package com.mcintosh.musicplayer;

public class Album {
    private String mAlbum;
    private String mArtist;
    // Drawable resource ID
    private int mImageResourceId;

    public Album(String album, String artist, int imageResourceId) {
        mAlbum = album;
        mArtist = artist;
        mImageResourceId = imageResourceId;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public String getArtist() {
        return mArtist;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
