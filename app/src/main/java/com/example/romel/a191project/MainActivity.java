package com.example.romel.a191project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hide status bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }

    public void play(View v) {
        Intent intent = new Intent(v.getContext(), GameProper.class);
        startActivity(intent);
    }

    public void instruction(View v) {
        Intent intent = new Intent(v.getContext(), Instructions.class);
        startActivity(intent);
    }

    public void exit(View v) {
        this.finish();
    }
}
