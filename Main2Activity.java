package com.example.my_game;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
Button blinkButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );



    }
    public  void  playButtonClick(View view){

                Intent intent = new Intent(Main2Activity.this,Main3Activity.class );
        startActivity( intent );

}}
