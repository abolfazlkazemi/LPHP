package com.example.lphp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class fehrest_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fehrest_activity);
        Button btn1=(Button)findViewById(R.id.btn1);
        Button btn2=(Button)findViewById(R.id.btn2);
        Button btn3=(Button)findViewById(R.id.btn3);
        Button btn4=(Button)findViewById(R.id.btn4);
        Button btn5=(Button)findViewById(R.id.btn5);


        btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent int1 = new Intent(fehrest_activity.this,fasl1_activity.class);
        startActivity(int1);
    }
    });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent( fehrest_activity.this,fasl2_activity.class);
                startActivity(int1);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent( fehrest_activity.this,fasl3_activity.class);
                startActivity(int1);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent( fehrest_activity.this,fasl4_activity.class);
                startActivity(int1);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent( fehrest_activity.this,fasl5_activity.class);
                startActivity(int1);
            }
        });


    }




}























//        Button button1 = findViewById(R.id.btn1);
//        Button button2 = findViewById(R.id.btn2);
//        Button button3 = findViewById(R.id.btn3);
//        Button button4 = findViewById(R.id.btn4);
//        Button button5 = findViewById(R.id.btn5);
//
//
//        button1.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                Intent activity1Intent = new Intent(getApplicationContext(), fasl1_activity.class);
//                startActivity(activity1Intent);
//            }
//
//        });
//        button2.setOnClickListener(new View.OnClickListener() {
//@Override
//            public void onClick(View v) {
//                Intent activity1Intent = new Intent(getApplicationContext(), fasl2_activity.class);
//                startActivity(activity1Intent);
//            }
//
//        });
//
//
//
//    }
//
//}

