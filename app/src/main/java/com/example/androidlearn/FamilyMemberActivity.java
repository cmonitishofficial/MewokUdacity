package com.example.androidlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMemberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Father","Papa"));
        words.add(new word("Mother","Maa"));
        words.add(new word("Brother","Bhai"));
        words.add(new word("Sister","Behen"));
        words.add(new word("Grand Father","Dada"));
        words.add(new word("Grand Mother","Dadi"));
        words.add(new word("Uncle","Chacha"));
        words.add(new word("Aunty","Chachi"));
        words.add(new word("Friends","Dost"));
        words.add(new word("Son","Beta"));
        words.add(new word("Daughter","Beti"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}