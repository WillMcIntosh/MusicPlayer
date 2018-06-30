package com.mcintosh.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
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
        Integer selectedArtwork = 0;

        if (extras != null) {
            selectedTitle = extras.getString("TITLE");
            selectedArtist = extras.getString("ARTIST");
            selectedArtwork = extras.getInt("ART");
        }

        // Set values of layout based on Song currentSong
        TextView currentTitle = findViewById(R.id.info_title);
        TextView currentArtist = findViewById(R.id.info_artist);
        ImageView currentAlbumArt = findViewById(R.id.album_art);

        currentTitle.setText(selectedTitle);
        currentArtist.setText(selectedArtist);
        currentAlbumArt.setImageResource(selectedArtwork);

    }
}