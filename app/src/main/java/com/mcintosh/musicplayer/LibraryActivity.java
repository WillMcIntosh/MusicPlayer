package com.mcintosh.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an array of songs
        ArrayList<Song> songs = new ArrayList<>();

        /**
         * Giant ArrayList of Songs
         * This could probably be a db call on selected album if there is one
         * or just SELECT * FROM songs, but...
         */

        // 4x4
        songs.add(new Song("Some Chords", "deadmau5", "4x4=12",
                R.drawable.four));
        songs.add(new Song("Sofi Needs a Ladder", "deadmau5", "4x4=12",
                R.drawable.four));
        songs.add(new Song("A City in Florida", "deadmau5", "4x4=12",
                R.drawable.four));
        songs.add(new Song("Bad Selection", "deadmau5", "4x4=12",
                R.drawable.four));
        songs.add(new Song("Animal Rights", "deadmau5", "4x4=12",
                R.drawable.four));
        songs.add(new Song("I Said", "deadmau5", "4x4=12",
                R.drawable.four));
        songs.add(new Song("Right This Second", "deadmau5", "4x4=12",
                R.drawable.four));
        songs.add(new Song("Raise Your Weapon", "deadmau5", "4x4=12",
                R.drawable.four));
        songs.add(new Song("One Trick Pony", "deadmau5", "4x4=12",
                R.drawable.four));
        songs.add(new Song("Everything Before", "deadmau5", "4x4=12",
                R.drawable.four));

        // Human After All
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

        // Discovery
        songs.add(new Song("One More Time", "Daft Punk", "Discovery",
                R.drawable.discovery));
        songs.add(new Song("Aerodynamic", "Daft Punk", "Discovery",
                R.drawable.discovery));
        songs.add(new Song("Digital Love", "Daft Punk", "Discovery",
                R.drawable.discovery));
        songs.add(new Song("Harder, Better, Faster, Stronger", "Daft Punk", "Discovery",
                R.drawable.discovery));
        songs.add(new Song("Crescendolls", "Daft Punk", "Discovery",
                R.drawable.discovery));
        songs.add(new Song("Nightvision", "Daft Punk", "Discovery",
                R.drawable.discovery));
        songs.add(new Song("Superheroes", "Daft Punk", "Discovery",
                R.drawable.discovery));
        songs.add(new Song("High Life", "Daft Punk", "Discovery",
                R.drawable.discovery));
        songs.add(new Song("Something About Us", "Daft Punk", "Discovery",
                R.drawable.discovery));
        songs.add(new Song("Voyager", "Daft Punk", "Discovery",
                R.drawable.discovery));
        songs.add(new Song("Veridis Quo", "Daft Punk", "Discovery",
                R.drawable.discovery));
        songs.add(new Song("Short Circuit", "Daft Punk", "Discovery",
                R.drawable.discovery));
        songs.add(new Song("Face To Face", "Daft Punk", "Discovery",
                R.drawable.discovery));
        songs.add(new Song("Too Long", "Daft Punk", "Discovery",
                R.drawable.discovery));

        // Homework
        songs.add(new Song("Daftendirekt", "Daft Punk", "Homework",
                R.drawable.homework));
        songs.add(new Song("WDPK 83.7 FM", "Daft Punk", "Homework",
                R.drawable.homework));
        songs.add(new Song("Revolution 909", "Daft Punk", "Homework",
                R.drawable.homework));
        songs.add(new Song("Da Funk", "Daft Punk", "Homework",
                R.drawable.homework));
        songs.add(new Song("Phoenix", "Daft Punk", "Homework",
                R.drawable.homework));
        songs.add(new Song("Fresh", "Daft Punk", "Homework",
                R.drawable.homework));
        songs.add(new Song("Around the World", "Daft Punk", "Homework",
                R.drawable.homework));
        songs.add(new Song("Rollin' & Scratchin'", "Daft Punk", "Homework",
                R.drawable.homework));
        songs.add(new Song("Teachers", "Daft Punk", "Homework",
                R.drawable.homework));
        songs.add(new Song("High Fidelity", "Daft Punk", "Homework",
                R.drawable.homework));
        songs.add(new Song("Rock 'N Roll", "Daft Punk", "Homework",
                R.drawable.homework));
        songs.add(new Song("Oh Yeah", "Daft Punk", "Homework",
                R.drawable.homework));
        songs.add(new Song("Burnin'", "Daft Punk", "Homework",
                R.drawable.homework));
        songs.add(new Song("Indo Silver Club", "Daft Punk", "Homework",
                R.drawable.homework));
        songs.add(new Song("Alive", "Daft Punk", "Homework",
                R.drawable.homework));
        songs.add(new Song("Funk Ad", "Daft Punk", "Homework",
                R.drawable.homework));

        // get ARTIST selected from Intent on Artists page
        final String selectedAlbum = getIntent().getStringExtra("ALBUM");

        // remove all albums not by selected Artist if Album was selected
        if (selectedAlbum != null) {
            songs.removeIf(s -> !s.getAlbum().equals(selectedAlbum));
        }


        SongAdapter adapter =
                new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        // set onclick for songs and send info over to now playing
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song itemChosen = (Song) parent.getItemAtPosition(position);

                // start Albums activity and pass selected Artist
                Intent intent = new Intent(LibraryActivity.this, PlayingActivity.class);
                intent.putExtra("TITLE", itemChosen.getTitle());
                intent.putExtra("ARTIST", itemChosen.getArtist());
                intent.putExtra("ALBUM", itemChosen.getAlbum());
                intent.putExtra("ART", itemChosen.getImageResourceId());

                startActivity(intent);
            }
        });
    }
}
