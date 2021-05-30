package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


           Toast toast = Toast.makeText(this,"seconf activity",Toast.LENGTH_SHORT);
           toast.setGravity(Gravity.CENTER,0,0);
           toast.show();

    }



    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(this,"second resume",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(this,"second pause",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(this,"second stop",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }
}