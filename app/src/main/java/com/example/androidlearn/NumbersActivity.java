package com.example.androidlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("one","Ek"));
        words.add(new word("Two","Doo"));
        words.add(new word("Three","Teen"));
        words.add(new word("Four","Char"));
        words.add(new word("Five","Panch"));
        words.add(new word("Six","Chhah"));
        words.add(new word("Seven","Saat"));
        words.add(new word("Eight","aath"));
        words.add(new word("Nine","Nauu"));
        words.add(new word("Ten","Das"));
        words.add(new word("Eleven","Gyarah"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}