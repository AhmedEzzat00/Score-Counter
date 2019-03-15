/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.educ.ahmed.scorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the Golf score for 2 Players.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scorePlayerA = 0;

    // Tracks the score for Team B
    int scorePlayerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    /**
     * Increase the score for Player A by 3 point.
     */
    public void subtractThreeForPlayerA(View v) {
        scorePlayerA = scorePlayerA - 3;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increase the score for Player A by 2 points.
     */
    public void subtractTwoForPlayerA(View v) {
        scorePlayerA = scorePlayerA - 2;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increase the score for Player A by 1 points.
     */
    public void subtractOneForPlayerA(View v) {
        scorePlayerA = scorePlayerA - 1;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Decrease the score for Player A by 1 points.
     */
    public void addOneForPlayerA(View v) {
        scorePlayerA = scorePlayerA + 1;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Decrease the score for Player A by 2 points.
     */
    public void addTwoForPlayerA(View v) {
        scorePlayerA = scorePlayerA + 2;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Decrease the score for Player B by 1 point.
     */
    public void addOneForPlayerB(View v) {
        scorePlayerB = scorePlayerB + 1;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Decrease the score for Player B by 2 points.
     */
    public void addTwoForPlayerB(View v) {
        scorePlayerB = scorePlayerB + 2;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Increase the score for Player B by 3 point.
     */
    public void subtractThreeForPlayerB(View v) {
        scorePlayerB = scorePlayerB - 3;
        displayForPlayerA(scorePlayerB);
    }

    /**
     * Increase the score for Player B by 2 points.
     */
    public void subtractTwoForPlayerB(View v) {
        scorePlayerB = scorePlayerB - 2;
        displayForPlayerA(scorePlayerB);
    }

    /**
     * Increase the score for Player B by 1 points.
     */
    public void subtractOneForPlayerB(View v) {
        scorePlayerB = scorePlayerB - 1;
        displayForPlayerA(scorePlayerB);
    }


    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
