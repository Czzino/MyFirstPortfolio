package com.paxi2020.myfirstportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import java.net.URL;

public class IntroActivity extends AppCompatActivity {

    Handler handler = new Handler();
    Runnable r = new Runnable() {
        @Override
        public void run() {
            //4초뒤에 다음 화면으로 넘어가기  Handler 사용
            Intent intent= new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish(); //액티비티 화면 제거
        }
    };

    @Override
    protected void onResume() {
        super.onResume();
        handler.postDelayed(r,4000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(r);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

    }


}
