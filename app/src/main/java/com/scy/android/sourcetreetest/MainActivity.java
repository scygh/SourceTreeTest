package com.scy.android.sourcetreetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void feature_1(){
        Log.d(TAG, "feature_1: MainActivity");
    }

    public void feature_2(){

    }

    public void feature_3(){

    }
}
