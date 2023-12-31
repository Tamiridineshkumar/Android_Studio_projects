package com.tefologic.androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }
    public void btn14(View view) {
        Intent chinni = new Intent(page3.this, online_voting_system.class);
        startActivity(chinni);
    }
    public void btn15(View view) {
        Intent chinni = new Intent(page3.this, trainfood.class);
        startActivity(chinni);
    }
    public void btn13(View view) {
        Intent chinni = new Intent(page3.this, onlineexam.class);
        startActivity(chinni);
    }
    public void btn16(View view) {
        Intent chinni = new Intent(page3.this, womensafety.class);
        startActivity(chinni);
    }
    public void btn17(View view) {
        Intent chinni = new Intent(page3.this, onlinevaccination.class);
        startActivity(chinni);
    }
}