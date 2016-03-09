package com.vutuanchien.android_chap06_usingintent;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    //    Using Intent to start another Activity
    public void addListenerOnButton() {
        final Context context = MainActivity.this;
        btnMove = (Button) findViewById(R.id.btnMove);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SecondScreen.class);
                startActivity(intent);
            }
        });
    }
}
