package com.example.demoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AnimeActivity extends AppCompatActivity {
    private ListView lvAnimeImage;
    ArrayList<AnimeImage> animeImageArrayList;
    AnimeAdapter animeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime);
        mapping();
        animeAdapter = new AnimeAdapter(this, R.layout.anime_lines, animeImageArrayList);
        lvAnimeImage.setAdapter(animeAdapter);
    }

    private void mapping() {
        lvAnimeImage = (ListView) findViewById(R.id.listViewAnimeImage);
        animeImageArrayList = new ArrayList<>();
        animeImageArrayList.add(new AnimeImage("anime 1", "anime 1", R.drawable.anime1));
        animeImageArrayList.add(new AnimeImage("anime 2", "anime 2", R.drawable.anime2));
        animeImageArrayList.add(new AnimeImage("anime 3", "anime 3", R.drawable.anime3));
        animeImageArrayList.add(new AnimeImage("anime 4", "anime 4", R.drawable.anime4));
        animeImageArrayList.add(new AnimeImage("anime 5", "anime 5", R.drawable.anime5));
        animeImageArrayList.add(new AnimeImage("anime 6", "anime 6", R.drawable.anime6));
        animeImageArrayList.add(new AnimeImage("anime 7", "anime 7", R.drawable.anime7));
        animeImageArrayList.add(new AnimeImage("anime 8", "anime 8", R.drawable.anime8));
        animeImageArrayList.add(new AnimeImage("anime 9", "anime 9", R.drawable.anime9));
        animeImageArrayList.add(new AnimeImage("anime 10", "anime 10", R.drawable.anime10));
        animeImageArrayList.add(new AnimeImage("anime 11", "anime 11", R.drawable.anime11));
        animeImageArrayList.add(new AnimeImage("anime 12", "anime 12", R.drawable.anime12));
        animeImageArrayList.add(new AnimeImage("anime 13", "anime 13", R.drawable.anime13));
        animeImageArrayList.add(new AnimeImage("anime 14", "anime 14", R.drawable.anime14));
        animeImageArrayList.add(new AnimeImage("anime 15", "anime 15", R.drawable.b83651e87332d7a9e4328ab93fe785e4));
        animeImageArrayList.add(new AnimeImage("anime 16", "anime 16", R.drawable.dc0eeb9e5380973bfff6a5d5930da2b3));
        animeImageArrayList.add(new AnimeImage("anime 17", "anime 17", R.drawable.anime15));
        animeImageArrayList.add(new AnimeImage("anime 18", "anime 18", R.drawable.anime16));
        animeImageArrayList.add(new AnimeImage("anime 19", "anime 19", R.drawable.anime17));
        animeImageArrayList.add(new AnimeImage("anime 20", "anime 20", R.drawable.anime18));
        animeImageArrayList.add(new AnimeImage("anime 21", "anime 21", R.drawable.anime19));
        animeImageArrayList.add(new AnimeImage("anime 22", "anime 22", R.drawable.anime20));

    }
}