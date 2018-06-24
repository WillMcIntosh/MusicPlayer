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

        albums.add(new Album("Daft Punk","Daft Punk", R.drawable.donut));
        albums.add(new Album("Human After All","Daft Punk", R.drawable.donut));
        albums.add(new Album("4x4","deadmau5", R.drawable.donut));

        AlbumAdapter adapter =
                new AlbumAdapter(this, albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}

