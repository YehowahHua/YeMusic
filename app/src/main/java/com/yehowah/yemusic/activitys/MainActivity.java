package com.yehowah.yemusic.activitys;

import android.os.Bundle;

import com.yehowah.yemusic.R;

public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initView();
    }

    private void initView() {
        initNavBar(false,"Ye音乐",true);//显示个人中心
    }
}
