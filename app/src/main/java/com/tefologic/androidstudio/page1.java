package com.tefologic.androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
    }
    public void btn(View view){
        Intent chinni=new Intent(page1.this, page2.class);
        startActivity(chinni);
    }
    public void btn12(View view){
        Intent chinni=new Intent(page1.this, page3.class);
        startActivity(chinni);
    }
}