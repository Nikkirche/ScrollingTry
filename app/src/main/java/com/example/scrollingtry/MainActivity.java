package com.example.scrollingtry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageButton button1 = findViewById(R.id.buttonParty );
        setContentView(R.layout.activity_main);

        RecyclerView view = findViewById(R.id.list);

        MyAdapter adapter = new MyAdapter(getData());

        view.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);

        view.setHasFixedSize(true);
        view.setNestedScrollingEnabled(true);

        view.setLayoutManager(manager);


    }

    public ArrayList<Party> getData() {
        ArrayList<Party> data = new ArrayList<>();
        data.add( new Party("Смотрим тарантино на Невском","Невский проспект 45",56,18,"Вечеринка","besplatno","04.06.20 20.00","tarantino.jpg","QWERTYUIOASDFGHJKL;ZXCVBNM") );
        data.add( new Party("Раммштайн","Футбольная аллея дом 6",560,18,"Концерт","platno"," 04.04.20 19.00","rammstein.jpg","qwertyuiuytdsdfghjklkjhgfdfghj") );
        data.add( new Party("Вписка у Леры","Улица рубинштейна 8",516,16,"Вечеринка","besplatno","22.00","vpiska.jpg","dfghjhgfd fghjuytretyuiu") );
        data.add( new Party("День Рождения Лауры","3 советская улица 27",569,12,"Вечеринка","besplatno","2.04.20 17.15","dr.jpg","fdghjrertyuytrety") );
        return data;
    }
    public void GoToViewActivity(){
        Intent intent = new Intent( MainActivity.this,PartyviewActivity.class );

        startActivity( intent );
        finish();
    }
}