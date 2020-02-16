package com.example.scrollingtry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView view = findViewById(R.id.list);
        ArrayList<String> data = new ArrayList<>();
        data.add("Barsik");
        data.add("Kiska");
        data.add("Pushok");
        MyAdapter adapter = new MyAdapter(data);
        view.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        view.setHasFixedSize(true);
        view.setNestedScrollingEnabled(true);
        view.setLayoutManager(manager);
    }
}
