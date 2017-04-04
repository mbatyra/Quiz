package com.example.mikoaj.quiz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
/**
 * Created by Mikołaj on 04.04.2017.
 */

public class Quiz extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
    }
    public void Quiz(View v)
    {
        Context context;
        context = getApplicationContext();
        Intent intent = new Intent(context,MainActivity.class);
        startActivity(intent);
    }



}
