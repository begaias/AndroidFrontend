package com.example.beka.loggin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.example.beka.loggin.R.id.radioButton;
import static com.example.beka.loggin.R.id.selection;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        radioGroup.clearCheck();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                TextView selection = (TextView) findViewById(R.id.selection);
                switch (checkedId) {
                    case R.id.radioButton:
                        selection.setText("Уведомления включены");
                        break;
                    case R.id.radioButton2:
                        selection.setText("Уведомления отключены");
                        break;
                }
            }
        });
    }
}