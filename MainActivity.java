package com.example.android.person_protect;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showOrHideSample(View view) {
        TextView sample = (TextView) findViewById(R.id.sample);
        changeVisibility(sample);
    }

    public void showOrHideCall911(View view) {
        TextView call911 = (TextView) findViewById(R.id.call911);
        changeVisibility(call911);
    }

    public void showOrHideWarts(View view) {
        TextView sampleMe = (TextView) findViewById(R.id.warts);
        changeVisibility(sampleMe);
    }

    public void showOrHideRed(View view) {
        TextView sampleMe = (TextView) findViewById(R.id.redTV);
        changeVisibility(sampleMe);
    }

    public void showOrHideRice(View view) {
        TextView riceTV1 = (TextView) findViewById(R.id.riceTV1);
        changeVisibility(riceTV1);
        TextView riceTV2 = (TextView) findViewById(R.id.riceTV2);
        changeVisibility(riceTV2);
    }

    public void showOrHideAbc(View view) {
        TextView abcTV1 = (TextView) findViewById(R.id.abcTV1);
        changeVisibility(abcTV1);
        TextView abcTV2 = (TextView) findViewById(R.id.abcTV2);
        changeVisibility(abcTV2);
        View abcImage = findViewById(R.id.abcImage);
        changeVisibility(abcImage);
    }

    private void changeVisibility(View tv){
        int visibility = tv.getVisibility();
        if (visibility == View.VISIBLE){
            tv.setVisibility(View.GONE);
        }
        else{
            tv.setVisibility(View.VISIBLE);
        }
    }
}


