package com.mcintosh.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        // get info selected from Intent on Library page

        Bundle extras = getIntent().getExtras();
        String selectedTitle = "No Title Selected";
        String selectedArtist = "No Artist Selected";
        String selectedAlbum = "No Album Selected";
        Integer selectedArtwork = 0;

        if (extras != null) {
            selectedTitle = extras.getString("TITLE");
            selectedArtist = extras.getString("ARTIST");
            selectedAlbum = extras.getString("ALBUM");
            selectedArtwork = extras.getInt("ART");
        }


        Log.v("ARTWORK LOCATION IS AT", "" + selectedArtwork);
        // create Song object out of passed info
        Song currentSong = new Song(selectedTitle, selectedArtist, selectedAlbum, selectedArtwork);

        // TODO: set values of layout based on Song currentSong





    }
}