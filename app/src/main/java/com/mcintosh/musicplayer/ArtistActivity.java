package com.mcintosh.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an array of artists
        ArrayList<Artist> artists = new ArrayList<>();

        artists.add(new Artist("Daft Punk", R.drawable.daft));
        artists.add(new Artist("deadmau5", R.drawable.deadmau5));


        ArtistAdapter adapter =
                new ArtistAdapter(this, artists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);



        // set up click listener for list of albums
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Artist itemChosen = (Artist) parent.getItemAtPosition(position);

                // start Albums activity and pass selected Artist
                Intent intent = new Intent(ArtistActivity.this, AlbumActivity.class);
                intent.putExtra("ARTIST", itemChosen.getArtist());

                startActivity(intent);
            }
        });

    }
}
