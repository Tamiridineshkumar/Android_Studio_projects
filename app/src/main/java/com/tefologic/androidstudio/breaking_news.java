package com.tefologic.androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class breaking_news extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breaking_news);
    }
    public void btn9(View view)
    {
        String w ="https://github.com/sooshin/android-news-app";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(w));
        startActivity(i);
    }
}