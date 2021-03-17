package com.example.my_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText player1, player2;

    Button submitName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate (savedInstanceState);

        setContentView (R.layout.activity_main3);

        final EditText player1 = (EditText) findViewById (R.id.editText);

        final EditText player2 = (EditText) findViewById (R.id.editText2);

        Button submitName = (Button) findViewById (R.id.submitName);

        submitName.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                String editText = player1.getText ().toString ();

                String editText1 = player2.getText ().toString ();


                if (editText.isEmpty ()) {

                    player1.setText ("enter your name");

                }
                if (editText1.isEmpty ()) {

                    player2.setText ("enter your name");
                }

                else{
                    Intent intent = new Intent ( Main3Activity.this, Main6Activity.class );

                    intent.putExtra ("player1",editText);

                    startActivity( intent );

                    Intent intent2 = new Intent ( Main3Activity.this, Main6Activity.class );

                    intent.putExtra ("player2",editText1);

                    startActivity( intent );
                }

            }


        });
    }
}

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate( savedInstanceState );
//        setContentView( R.layout.activity_main3 );
//
//        Intent intent=new Intent(Main3Activity.this,Main6Activity.class);
//        startActivity( intent );


