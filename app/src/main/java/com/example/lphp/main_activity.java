package com.example.lphp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.Timer;


public class main_activity extends AppCompatActivity {

    private Object Timer;
    Timer timer;
    private Object Intent;

    public main_activity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
//
//        timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
////                 new  fehrest_activity(Intent);
//                Intent intent = new Intent(main_activity.this, fehrest_activity.class);
//                startActivity(intent);
//                finish();
//            }
//
//        }, 5000);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(main_activity.this, fehrest_activity.class);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }
}