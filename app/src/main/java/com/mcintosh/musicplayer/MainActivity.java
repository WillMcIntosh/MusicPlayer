package com.mcintosh.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the artists category
        TextView artists = (TextView) findViewById(R.id.artists);

        // Set up click listener for Artist Activity
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artist category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistActivity}
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);

                // Start the new activity
                startActivity(artistIntent);
            }
        });

        // Find the View that shows the albums category
        TextView albums = (TextView) findViewById(R.id.albums);

        // Set up click listener for Album Activity
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the album category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumActivity}
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);

                // Start the new activity
                startActivity(albumIntent);
            }
        });

        // Find the View that shows the library category
        TextView library = (TextView) findViewById(R.id.library);

        // Set up click listener for Library Activity
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LibraryActivity}
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);

                // Start the new activity
                startActivity(libraryIntent);
            }
        });
    }
}