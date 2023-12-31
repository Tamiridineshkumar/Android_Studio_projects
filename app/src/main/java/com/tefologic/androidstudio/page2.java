package com.tefologic.androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    public void btn2(View view) {
        Intent chinni = new Intent(page2.this, TicTacToe.class);
        startActivity(chinni);
    }

    public void btn4(View view) {
        Intent chinni = new Intent(page2.this, photomanagement.class);
        startActivity(chinni);
    }

    public void btn6(View view) {
        Intent chinni = new Intent(page2.this, tuition_notes.class);
        startActivity(chinni);
    }

    public void btn8(View view) {
        Intent chinni = new Intent(page2.this, breaking_news.class);
        startActivity(chinni);
    }

    public void btn10(View view) {
        Intent chinni = new Intent(page2.this, songsapp.class);
        startActivity(chinni);
    }
}