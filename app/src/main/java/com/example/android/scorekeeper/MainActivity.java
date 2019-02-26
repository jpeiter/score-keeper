package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TeamA teamA;
    private TeamB teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamA = new TeamA();
        teamB = new TeamB();
    }

    public void addScoreA(View view){
        teamA.setScore(teamA.getScore() + 1);
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        textView.setText(String.valueOf(teamA.getScore()));
    }

    public void addFoulA(View view){
        teamA.setFouls(teamA.getFouls() + 1);
        TextView textView = (TextView) findViewById(R.id.team_a_fouls);
        textView.setText(String.valueOf(teamA.getFouls()));
    }

    public void addScoreB(View view){
        teamB.setScore(teamB.getScore() + 1);
        TextView textView = (TextView) findViewById(R.id.team_b_score);
        textView.setText(String.valueOf(teamB.getScore()));
    }

    public void addFoulB(View view){
        teamB.setFouls(teamB.getFouls() + 1);
        TextView textView = (TextView) findViewById(R.id.team_b_fouls);
        textView.setText(String.valueOf(teamB.getFouls()));
    }

    public void reset(View view){
        teamA.setScore(0);
        teamB.setScore(0);
        teamA.setFouls(0);
        teamB.setFouls(0);

        TextView textView = (TextView) findViewById(R.id.team_a_score);
        textView.setText(String.valueOf(teamA.getScore()));

        textView = (TextView) findViewById(R.id.team_a_fouls);
        textView.setText(String.valueOf(teamA.getFouls()));

        textView = (TextView) findViewById(R.id.team_b_fouls);
        textView.setText(String.valueOf(teamB.getFouls()));

        textView = (TextView) findViewById(R.id.team_b_score);
        textView.setText(String.valueOf(teamB.getScore()));
    }


}
