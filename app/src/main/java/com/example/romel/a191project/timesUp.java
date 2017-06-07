package com.example.romel.a191project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class timesUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hide status bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_times_up);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);

        TextView question = (TextView) findViewById(R.id.score);
        question.setText("score " + score);
    }

    public void playAgain(View v) {
        this.finish();
        Intent intent = new Intent(v.getContext(), GameProper.class);
        startActivity(intent);
    }
}
