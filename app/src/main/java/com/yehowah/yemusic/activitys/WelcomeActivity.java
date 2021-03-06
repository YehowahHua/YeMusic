package com.yehowah.yemusic.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.yehowah.yemusic.R;

import java.util.Timer;
import java.util.TimerTask;

//1.延迟3s后，
//2.跳转到其他Activity
public class WelcomeActivity extends BaseActivity {
    private static final String TAG = "WelcomeActivity";
    private Timer mTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();

    }

    private void init() {
        mTimer = new Timer();
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Log.e(TAG, "run: 当前线程为 "+Thread.currentThread() );//run是在主线程
//                toMain();
                toLogin();
            }
        },3*1000);
    }

    /**
     * 跳转到MainActivity
     */
//    private void toMain(){
//        Intent intent = new Intent(this,MainActivity.class);
//        startActivity(intent);
//        finish();//关闭当前界面
//    }

    /**
     * 跳转到登录界面
     */
    private void toLogin(){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
        finish();//关闭当前界面
    }
}
