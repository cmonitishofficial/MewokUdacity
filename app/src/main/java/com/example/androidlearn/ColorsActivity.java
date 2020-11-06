package com.example.androidlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Red","Laal"));
        words.add(new word("Green","Hara"));
        words.add(new word("Blue","Neela"));
        words.add(new word("Orange","Narangi"));
        words.add(new word("Black","Kala"));
        words.add(new word("Yellow","Peela"));
        words.add(new word("White","Ujla"));
        words.add(new word("Voilet","Baingni"));
        words.add(new word("Indigo","Aasmani Neela"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}