package com.example.newscoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class MainActivity extends AppCompatActivity {

private  int a;//for holding team a score
private int b;//for holding team b score
private TextView TeamAScore;//for TextView
private TextView TeamBScore;//for TextView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TeamAScore = findViewById(R.id.textView4);
        TeamBScore=findViewById(R.id.textView3);


    }


    public void points5(View view) {
        a =a+5;
        displayTeamA(a);
    }

    public void points3(View view) {
        a=a+3;
        displayTeamA(a);
    }

    public void points2(View view) {
        a=a+2;
        displayTeamA(a);
    }


    public void points51(View view) {
        b=b+5;
        displayTeamB(b);
    }


    public void points31(View view) {
        b=b+3;
        displayTeamB(b);
    }

    public void points21(View view) {
        b=b+2;
        displayTeamB(b);
    }

    public void displayTeamA(int score)
    {
        TeamAScore.setText(String.valueOf(score));
    }
    public void displayTeamB(int score)
    {
        TeamBScore.setText((String.valueOf(score)));
    }

    public void reset(View view) {
        a=0;
        b=0;
        displayTeamA(a);
        displayTeamB(b);

    }
}
