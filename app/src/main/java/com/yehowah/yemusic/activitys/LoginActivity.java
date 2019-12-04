package com.yehowah.yemusic.activitys;

import android.os.Bundle;

import com.yehowah.yemusic.R;

//NavigationBar 顶部导航
public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }


    private void initView(){
        //初始化navBar
        initNavBar(false,"登录",false);
    }
}
