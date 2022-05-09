package com.example.changebackgroundcolor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ConstraintLayout layout;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout=findViewById(R.id.rootlayout);
        radioGroup=findViewById(R.id.rgroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton dark=findViewById(R.id.darkcolor);
                RadioButton light=findViewById(R.id.lightcolor);
                RadioButton def=findViewById(R.id.defaultcolor);
                switch (checkedId){
                    case R.id.darkcolor:
                        layout.setBackgroundColor(Color.parseColor("#242B2E"));
                        light.setTextColor(Color.parseColor("#FFFFFF"));
                        dark.setTextColor(Color.parseColor("#FFFFFF"));
                        def.setTextColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(getApplicationContext(),"Dark Mode Enabled", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.lightcolor:
                        layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        light.setTextColor(Color.parseColor("#242B2E"));
                        dark.setTextColor(Color.parseColor("#242B2E"));
                        def.setTextColor(Color.parseColor("#242B2E"));
                        Toast.makeText(getApplicationContext(),"Light Mode Enabled", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.defaultcolor:
                        layout.setBackgroundColor(Color.parseColor("#E07C24"));
                        light.setTextColor(Color.parseColor("#FFFFFF"));
                        dark.setTextColor(Color.parseColor("#FFFFFF"));
                        def.setTextColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(getApplicationContext(),"Default Mode Enabled", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });
    }
}