package com.yehowah.yemusic.activitys;

import android.os.Bundle;
import android.view.View;

import com.yehowah.yemusic.R;

public class RegisterActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();
    }

    /**
     * 初始化View
     */
    private void initView() {
        initNavBar(true,"注册",false);
    }

    /**
     * 点击事件
     */
    public void onRegisterClick(View v){

    }
}
