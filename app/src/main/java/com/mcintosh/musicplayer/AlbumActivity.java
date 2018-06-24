package com.mcintosh.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
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

        // set up click listener for only the homework album
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Album itemChosen = (Album) parent.getItemAtPosition(position);

                // start Library activity only if Homework is clicked on
                if (itemChosen.getAlbum() == "Homework") {
                    Intent intent = new Intent(AlbumActivity.this, LibraryActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}

