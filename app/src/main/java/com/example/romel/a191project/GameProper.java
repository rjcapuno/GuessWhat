package com.example.romel.a191project;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Integer.parseInt;

public class GameProper extends AppCompatActivity {
    private Intent intent;
    private SQLiteDatabase db;
    private Cursor cursor;

    private ArrayList<Integer> asked;
    private boolean running;
    private int time = 60;
    private int life = 3;
    private int score = 0;
    private int max;
    private int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hide status bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game_proper);
        intent = new Intent(this, timesUp.class);
        if (savedInstanceState != null) {
            time = savedInstanceState.getInt("time");
            running = savedInstanceState.getBoolean("running");
        }

        try {
            SQLiteOpenHelper guessWhatDatabaseHelpper = new GuessWhatDatabaseHelpper(this);
            SQLiteDatabase db = guessWhatDatabaseHelpper.getReadableDatabase();

            Cursor cursor = db.query(
                    "QUESTIONS",
                    new String[]{"QUESTION", "A", "B", "C", "D", "ANSWER"},
                    null, null, null, null, null
            );

            max = cursor.getCount();
        } catch (SQLException e) {

        }


        asked = new ArrayList<Integer>();
        running = true;
        runTimer();
        selectQuestion();
    }

    public void runTimer() {
        final TextView timeView = (TextView) findViewById(R.id.timer);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int seconds = time;

                String timer = String.format("%02d", seconds);
                timeView.setText(timer);

                if (seconds == 0) {
                    timesUp();
                }

                if (running) {
                    time--;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }

    public void timesUp() {
        time = 60;
        running = false;
        this.finish();
        intent.putExtra("score", score);
        startActivity(intent);
    }

    private int randomize() {
        Random rnd = new Random();
        int rn=0;

        if(asked.size() < max) {
            while (asked.contains(rn) || rn == 0) {
                rn = rnd.nextInt(max);
                rn++;
            }
            asked.add(rn);
            return (rn);
        } else {
         return 0;
        }
    }

    private void selectQuestion() {
        try {
            SQLiteOpenHelper guessWhatDatabaseHelpper = new GuessWhatDatabaseHelpper(this);
            SQLiteDatabase db = guessWhatDatabaseHelpper.getReadableDatabase();

            int rn = randomize();
            if(rn == 0) { timesUp(); }

            Cursor cursor = db.query(
                    "QUESTIONS",
                    new String[]{"QUESTION", "A", "B", "C", "D", "ANSWER"},
                    "_id = " + rn,
                    null, null, null, null
            );

            if (cursor.moveToFirst()) {

                TextView question = (TextView) findViewById(R.id.Question);
                question.setText(cursor.getString(0));

                TextView a = (TextView) findViewById(R.id.choiceA);
                a.setText(cursor.getString(1));

                TextView b = (TextView) findViewById(R.id.choiceB);
                b.setText(cursor.getString(2));

                TextView c = (TextView) findViewById(R.id.choiceC);
                c.setText(cursor.getString(3));

                TextView d = (TextView) findViewById(R.id.choiceD);
                d.setText(cursor.getString(4));

                answer = parseInt(cursor.getString(5));

            }


            cursor.close();
            db.close();


        } catch (SQLException e) {

        }
    }

    public void pressA(View v) { checkAnswer(0); }

    public void pressB(View v) {
        checkAnswer(1);
    }

    public void pressC(View v) {
        checkAnswer(2);
    }

    public void pressD(View v) {
        checkAnswer(3);
    }

    private void checkAnswer(int ans) {
        if(ans == answer) {
            score++;
            System.out.println("CORRECT!");
        } else {
            life--;
            if(life == 2) {
                ImageView heart = (ImageView) findViewById(R.id.heart3);
                heart.setVisibility(heart.GONE);
            } else if(life == 1) {
                ImageView heart = (ImageView) findViewById(R.id.heart2);
                heart.setVisibility(heart.GONE);
            } else if(life ==0) {
                ImageView heart = (ImageView) findViewById(R.id.heart1);
                heart.setVisibility(heart.GONE);
                timesUp();
            }
        }
        if(life != 0) {
            selectQuestion();
        }
    }

    @Override
    public void onBackPressed() {
        running = false;
        this.finish();
    }
}
