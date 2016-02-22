package com.choinisae.donghaechoi.exam_fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

//        Add_Fragment frag1 = (Add_Fragment) getSupportFragmentManager().findFragmentById(R.id.frag1);
//        frag1.setColor(Color.RED);

        findViewById(R.id.add_btn1).setOnClickListener(this);
        findViewById(R.id.add_btn2).setOnClickListener(this);
        findViewById(R.id.add_btn3).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.add_btn1: {
                Add_Fragment addFragment = Add_Fragment.newInstance(Color.RED);
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_0, addFragment)
                        .commit();
                break;
            }
            case R.id.add_btn2: {
                Add_Fragment addFragment = Add_Fragment.newInstance(Color.BLUE);
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_1, addFragment)
                        .commit();
                break;
            }
            case R.id.add_btn3: {
                Add_Fragment addFragment = Add_Fragment.newInstance(Color.YELLOW);
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_2, addFragment)
                        .commit();
                break;
            }
        }
    }
}
