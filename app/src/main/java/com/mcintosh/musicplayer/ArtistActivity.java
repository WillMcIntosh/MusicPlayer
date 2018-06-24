package com.mcintosh.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an array of artists
        ArrayList<Artist> artists = new ArrayList<>();

        artists.add(new Artist("Daft Punk", R.drawable.donut));
        artists.add(new Artist("deadmau5", R.drawable.donut));


        ArtistAdapter adapter =
                new ArtistAdapter(this, artists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
