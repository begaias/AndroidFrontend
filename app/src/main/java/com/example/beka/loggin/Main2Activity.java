package com.example.beka.loggin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton imageButton = (ImageButton) findViewById(R.id.iB);
        imageButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iB:
                Intent intent = new Intent(Main2Activity.this, Settings.class);
                startActivity(intent);
                break;
            case R.id.btnDate:
                Intent intent1 = new Intent(Main2Activity.this, Date.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}