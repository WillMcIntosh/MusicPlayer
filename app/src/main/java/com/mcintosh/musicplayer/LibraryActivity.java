package com.mcintosh.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an array of songs
        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Human After All", "Daft Punk", "Human After All",
                R.drawable.human));
        songs.add(new Song("The Prime Time of Your Life", "Daft Punk", "Human After All",
                R.drawable.human));
        songs.add(new Song("Robot Rock", "Daft Punk", "Human After All",
                R.drawable.human));
        songs.add(new Song("Steam Machine", "Daft Punk", "Human After All",
                R.drawable.human));
        songs.add(new Song("Make Love", "Daft Punk", "Human After All",
                R.drawable.human));
        songs.add(new Song("The Brainwasher", "Daft Punk", "Human After All",
                R.drawable.human));
        songs.add(new Song("On/Off", "Daft Punk", "Human After All",
                R.drawable.human));
        songs.add(new Song("Television Rules the Nation", "Daft Punk", "Human After All",
                R.drawable.human));
        songs.add(new Song("Technologic", "Daft Punk", "Human After All",
                R.drawable.human));
        songs.add(new Song("Emotion", "Daft Punk", "Human After All",
                R.drawable.human));

        SongAdapter adapter =
                new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
