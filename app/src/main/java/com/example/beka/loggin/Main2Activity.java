package com.example.beka.loggin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = (ImageView) findViewById(R.id.setting);
        imageView.setOnClickListener(this);
        //ImageButton imageButton = (ImageButton) findViewById(R.id.dateBtn);
        //imageButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.setting:
                Intent intent2 = new Intent(Main2Activity.this, Settings.class);
                startActivity(intent2);
                break;
                case R.id.dateBtn:
                   Intent intent1 = new Intent(Main2Activity.this,calendr.class);
                    startActivity(intent1);
                   break;
            default:
                break;
        }
    }
}
