package com.example.gabrielmechali.myapp;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TableLayout;

public class DisplayPosts extends AppCompatActivity {


    private TableLayout tableScrollView;
    private ScrollView scrollView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_posts);


        tableScrollView = (TableLayout) findViewById(R.id.layoutScrollView);
        scrollView = (ScrollView) findViewById(R.id.postsScrollView);

        for (int i = 0; i < 15;i++) {
            insertListing();
        }

    }

    private void insertListing(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View newStockRow = inflater.inflate(R.layout.activity_individual_post, null);
        tableScrollView.addView(newStockRow);
    }
}
