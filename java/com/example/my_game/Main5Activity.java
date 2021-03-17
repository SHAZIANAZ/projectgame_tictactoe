package com.example.my_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main5 );
    }

    public void Withafriend(View view) {

        Intent intent = new Intent( Main5Activity.this, Main2Activity.class );
        startActivity( intent );

        } public void withai(View view) {

        Intent intent1 = new Intent( Main5Activity.this, Main7Activity.class );
        startActivity( intent1 );

    }}
