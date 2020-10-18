package com.example.androidlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        NumbersClickListener numbersClickListener = new NumbersClickListener();

//        find the view that shows the numbers category.
        final TextView numbers = (TextView) findViewById(R.id.numbers);

//        set a click listener on that view.
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Create a new Intent to Open the Numbers Activity.
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
                Toast.makeText(view.getContext(), "Open the List of Numbers", Toast.LENGTH_SHORT).show();
            }
        });

//        this is for Family members
        TextView family = (TextView) findViewById(R.id.family);

//        set a Click Listener ON family TextView .
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Intent familyIntent = new Intent(MainActivity.this,FamilyMemberActivity.class);

                startActivity(new Intent(MainActivity.this,FamilyMemberActivity.class));

                Toast.makeText(v.getContext(), "Open the List of Family Members", Toast.LENGTH_SHORT).show();
            }
        });


//        this is for Colors Activity OnClicklistener method
        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorsIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorsIntent);
                Toast.makeText(v.getContext(),"Open the the Colors ",Toast.LENGTH_SHORT).show();
            }
        });

//        this is for Pharases Activity  set OnclickListener Method
        TextView pharases = (TextView) findViewById(R.id.phrases);
        pharases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pharasesIntent = new Intent(MainActivity.this,PharasesActivity.class);
                startActivity(pharasesIntent);
                Toast.makeText(v.getContext(),"Open the Pharases",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
