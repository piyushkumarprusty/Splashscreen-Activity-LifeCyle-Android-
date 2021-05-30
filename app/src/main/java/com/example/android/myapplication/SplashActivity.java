package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /*  thread is java built in class to do parallel work*/

        Thread thread = new Thread(){
            public void run(){
                try {

                    sleep(4000);

                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);
                }

            }
        };thread.start();
        /* Now to start this splash activity we have to copy the intent in manifest ac to splash*/

    }
}