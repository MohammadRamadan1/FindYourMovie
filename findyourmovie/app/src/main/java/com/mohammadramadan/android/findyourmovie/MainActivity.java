package com.mohammadramadan.android.findyourmovie;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerButton();
        addListenerButton1();
        addListenerButton2();
        addListenerButton3();
        addListenerButton4();

    }

    public void addListenerButton() {
        final Context context = this;
        Button button = findViewById(R.id.action_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ActionActivity.class);
                startActivity(intent);
            }
        });
    }

    public void addListenerButton1() {
        final Context context = this;
        Button button = findViewById(R.id.comedy_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ComedyActivity.class);
                startActivity(intent);
            }
        });
    }

    public void addListenerButton2() {
        final Context context = this;
        Button button = findViewById(R.id.romantic_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RomanticActivity.class);
                startActivity(intent);
            }
        });
    }

    public void addListenerButton3() {
        final Context context = this;
        Button button = findViewById(R.id.adventure_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AdventureActivity.class);
                startActivity(intent);
            }
        });
    }
    public void addListenerButton4() {
        final Context context = this;
        Button button = findViewById(R.id.top_movies);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TopMoviesActivity.class);
                startActivity(intent);
            }
        });
    }
}