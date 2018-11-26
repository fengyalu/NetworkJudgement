package com.example.administrator.demo02;

import android.os.Bundle;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setCheckNetWork(true);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
