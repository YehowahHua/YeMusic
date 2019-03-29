package com.yehowah.yemusic.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.yehowah.yemusic.R;

import java.util.Timer;
import java.util.TimerTask;

//3s后跳转到MainActivity
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
                Log.e(TAG, "run: 当前线程为 "+Thread.currentThread() );
//                toMain();
                toLogin();
            }
        },3*1000);
    }

    /**
     * 跳转到MainActivity
     */
    private void toMain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();//关闭当前界面
    }

    /**
     *
     */
    private void toLogin(){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
        finish();//关闭当前界面
    }
}
