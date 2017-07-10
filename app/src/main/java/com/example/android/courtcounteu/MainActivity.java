package com.example.android.courtcounteu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     /**
     * Displays the given score for Team A.
     */
     public void displayForTeamA(int score) {
         TextView scoreView = (TextView) findViewById(R.id.team_a_score);
         scoreView.setText(String.valueOf(score));
     }

    /**
     * Displays the given fouls for Team A.
     */
    public void displayFoulForTeamA(int score) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team B.
     */
    public void displayFoulForTeamB(int score) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(score));
    }

     public void addOneForTeamA (View V){
         scoreTeamA = scoreTeamA+1;
         displayForTeamA(scoreTeamA);
     }

     public void addFoulForTeamA (View V) {
         foulTeamA = foulTeamA+1;
         displayFoulForTeamA(foulTeamA);
     }

     public void addOneForTeamB (View V){
         scoreTeamB = scoreTeamB+1;
         displayForTeamB(scoreTeamB);
     }

    public void addFoulForTeamB (View V){
        foulTeamB = foulTeamB+1;
        displayFoulForTeamB(foulTeamB);
    }

    public void end (View V){
        TextView TeamNameA = (TextView) findViewById(R.id.TeamNameA);
        TextView TeamNameB = (TextView) findViewById(R.id.TeamNameB);

        if(scoreTeamA>scoreTeamB){
            String nameA = TeamNameA.getText().toString();
            Toast.makeText(getBaseContext(), nameA + " has won!",
                    Toast.LENGTH_LONG).show();
            TeamNameA.setText("");
            TeamNameB.setText("");
        }else if(scoreTeamA < scoreTeamB){
            String nameB = TeamNameB.getText().toString();
            Toast.makeText(getBaseContext(),  nameB +" has won!",
                    Toast.LENGTH_LONG).show();
            TeamNameA.setText("");
            TeamNameB.setText("");
        }else{
            Toast.makeText(getBaseContext(), "It's a Draw!",
                    Toast.LENGTH_LONG).show();
            TeamNameA.setText("");
            TeamNameB.setText("");
        }
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);

    }

}
