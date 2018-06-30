package com.mcintosh.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        // get info selected from Intent on Library page
        final String selectedTitle = getIntent().getStringExtra("TITLE");
        final String selectedArtist = getIntent().getStringExtra("ARTIST");
        final String selectedAlbum = getIntent().getStringExtra("ALBUM");
        final String selectedArtwork = getIntent().getStringExtra("ART");
        // Song expects an int value for artwork location
        int artIntValue = Integer.parseInt(selectedArtwork);

        // create Song object out of passed info
        Song currentSong = new Song(selectedTitle, selectedArtist, selectedAlbum, artIntValue);

        // TODO: set values of layout based on Song currentSong
//        SongAdapter adapter =
//                new SongAdapter(this, currentSong);
//
//        ListView listView = (ListView) findViewById(R.id.list);
//
//        listView.setAdapter(adapter);




    }
}