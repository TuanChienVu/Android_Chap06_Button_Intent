package com.vutuanchien.android_chap06_usingbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btnEvent = new Button(this);
        btnEvent.setOnClickListener(this);
        updateTime();
        setContentView(btnEvent);
    }

    @Override
    public void onClick(View v) {
        updateTime();
    }

    private void updateTime() {
        btnEvent.setText(new Date().toString());
    }
}
