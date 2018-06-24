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

        // Create an array of albums
        ArrayList<Album> albums = new ArrayList<>();

        albums.add(new Album("Homework","Daft Punk", R.drawable.homework));
        albums.add(new Album("Discovery","Daft Punk", R.drawable.discovery));
        albums.add(new Album("Human After All","Daft Punk", R.drawable.human));

        AlbumAdapter adapter =
                new AlbumAdapter(this, albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}

