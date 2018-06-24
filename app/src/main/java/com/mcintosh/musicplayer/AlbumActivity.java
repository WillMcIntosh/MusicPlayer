package com.mcintosh.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an array of words for numbers one through ten
        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Human After All", "Daft Punk", R.drawable.donut));
        songs.add(new Song("Human After All", "Daft Punk", R.drawable.donut));
        songs.add(new Song("Human After All", "Daft Punk", R.drawable.donut));
        songs.add(new Song("Human After All", "Daft Punk", R.drawable.donut));
        songs.add(new Song("Human After All", "Daft Punk", R.drawable.donut));
        songs.add(new Song("Human After All", "Daft Punk", R.drawable.donut));
        songs.add(new Song("Human After All", "Daft Punk", R.drawable.donut));
        songs.add(new Song("Human After All", "Daft Punk", R.drawable.donut));

        SongAdapter adapter =
                new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}

