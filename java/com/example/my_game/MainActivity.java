package com.example.my_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN=5000;
//variable
    Animation topanim,bottomanim;
    ImageView image;
    TextView welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        //Animation
        topanim = AnimationUtils.loadAnimation( this,R.anim.top_animation );
        bottomanim = AnimationUtils.loadAnimation( this,R.anim.bottom_animation );
       // Hooks
        image = findViewById( R.id.imageView );
        welcome =findViewById( R.id.textView );
        image.setAnimation( topanim );
        welcome.setAnimation( bottomanim );


        new Handler(  ).postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,Main5Activity.class);
                startActivity( intent );
                finish();
            }
        }, SPLASH_SCREEN);


    }
}
