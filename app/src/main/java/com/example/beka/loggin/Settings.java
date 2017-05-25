package com.example.beka.loggin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import static com.example.beka.loggin.R.id.radioButton;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        TextView selection = (TextView) findViewById(R.id.selection);
        switch(view.getId()) {
            case R.id.radioButton:
                if (checked){
                    selection.setText("Уведомления включены");
                }
                break;
            case R.id.radioButton2:
                if (checked){
                    selection.setText("Уведомления отключены");
                }
                break;
        }
    }
}
