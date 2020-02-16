package com.example.scrollingtry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView view = findViewById(R.id.list);

        MyAdapter adapter = new MyAdapter(getData());

        view.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);

        view.setHasFixedSize(true);
        view.setNestedScrollingEnabled(true);

        view.setLayoutManager(manager);

    }

    public ArrayList<Cat> getData() {
        ArrayList<Cat> data = new ArrayList<>();

        data.add(new Cat("Murzik", Color.argb(255, 255, 255, 255), false));
        data.add(new Cat("Barsik", Color.argb(255, 1, 2, 3), true));
        data.add(new Cat("Pushok", Color.argb(255, 255, 255, 255), false));
        data.add(new Cat("Murzik", Color.argb(255, 255, 255, 255), true));

        return data;
    }
}