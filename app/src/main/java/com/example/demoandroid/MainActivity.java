package com.example.demoandroid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.demoandroid.Post.PostItem;
import com.example.demoandroid.adapter.PostAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView postRecyclerView = findViewById(R.id.postRecyclerView);
        postRecyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        );
        List<PostItem> postItems = new ArrayList<>();
        postItems.add(new PostItem(R.drawable.agvae));
        postItems.add(new PostItem(R.drawable.anh));
        postItems.add(new PostItem(R.drawable.anhydep1));
        postItems.add(new PostItem(R.drawable.anime1));
        postItems.add(new PostItem(R.drawable.anime2));
        postItems.add(new PostItem(R.drawable.anime3));
        postItems.add(new PostItem(R.drawable.anime4));
        postItems.add(new PostItem(R.drawable.anime5));
        postItems.add(new PostItem(R.drawable.anime6));
        postItems.add(new PostItem(R.drawable.anime7));
        postItems.add(new PostItem(R.drawable.anime8));
        postItems.add(new PostItem(R.drawable.anime9));
        postItems.add(new PostItem(R.drawable.anime10));
        postItems.add(new PostItem(R.drawable.anime11));
        postItems.add(new PostItem(R.drawable.anime12));
        postItems.add(new PostItem(R.drawable.anime13));
        postItems.add(new PostItem(R.drawable.anime14));
        postItems.add(new PostItem(R.drawable.anime15));
        postItems.add(new PostItem(R.drawable.anime16));
        postItems.add(new PostItem(R.drawable.anime17));
        postItems.add(new PostItem(R.drawable.anime18));
        postItems.add(new PostItem(R.drawable.anime19));
        postItems.add(new PostItem(R.drawable.anime20));
        postItems.add(new PostItem(R.drawable.b83651e87332d7a9e4328ab93fe785e4));
        postItems.add(new PostItem(R.drawable.dc0eeb9e5380973bfff6a5d5930da2b3));
        postItems.add(new PostItem(R.drawable.edqrer));
        postItems.add(new PostItem(R.drawable.j5iyepy));

        postRecyclerView.setAdapter(new PostAdapter(postItems));
    }
}