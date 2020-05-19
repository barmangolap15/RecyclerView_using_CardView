package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    List<Model> modelList;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modelList = new ArrayList<>();
        recycler = findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        //call our items
        modelList.add(new Model(R.drawable.apple,"A","A for Apple"));
        modelList.add(new Model(R.drawable.ball,"B","B for Ball"));
        modelList.add(new Model(R.drawable.cat,"C","C for Cat"));
        modelList.add(new Model(R.drawable.donkey,"D","D for Donkey"));
        modelList.add(new Model(R.drawable.elephant,"E","E for Elephant"));
        modelList.add(new Model(R.drawable.fish,"F","F for Fish"));
        modelList.add(new Model(R.drawable.goat,"G","G for Goat"));
        modelList.add(new Model(R.drawable.hat,"H","H for Hat"));
        modelList.add(new Model(R.drawable.ink,"I","I for Ink"));
        modelList.add(new Model(R.drawable.jug,"J","J for Jug"));
        //init the adapter with model list and context
        adapter = new CustomAdapter(modelList,getApplicationContext());
        //set the adapter into recyclerView
        recycler.setAdapter(adapter);
    }
}
