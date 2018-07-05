package com.luoxudong.app.rndynamicload;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {
    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.tv_model_1:
                    startActivity(new Intent(MainActivity.this, com.luoxudong.app.modelone.ReactNativeActivity.class));
                    break;
                case R.id.tv_model_2:
                    startActivity(new Intent(MainActivity.this, com.luoxudong.app.modeltwo.ReactNativeActivity.class));
                    break;
                case R.id.tv_model_3:
                    startActivity(new Intent(MainActivity.this, com.luoxudong.app.modelthree.ReactNativeActivity.class));
                    break;
                case R.id.tv_model_4:
                    break;
                case R.id.tv_model_5:
                    break;
                case R.id.tv_model_6:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_model_1).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_model_2).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_model_3).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_model_4).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_model_5).setOnClickListener(mOnClickListener);
        findViewById(R.id.tv_model_6).setOnClickListener(mOnClickListener);
    }
}
