package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    int scoreA = 0;

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    public void plusThreeA(View view){
        scoreA +=3;
        displayForTeamA(scoreA);
    }
    public void plusTwoA(View view){
        scoreA +=2;
        displayForTeamA(scoreA);
    }
    public void freeThrowA(View view){
        scoreA +=1;
        displayForTeamA(scoreA);
    }
    int scoreB = 0;
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void plusThreeB(View view){
        scoreB +=3;
        displayForTeamB(scoreB);
    }
    public void plusTwoB(View view){
        scoreB +=2;
        displayForTeamB(scoreB);
    }
    public void freeThrowB(View view){
        scoreB +=1;
        displayForTeamB(scoreB);
    }
    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}