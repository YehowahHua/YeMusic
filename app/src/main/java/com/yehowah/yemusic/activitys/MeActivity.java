package com.yehowah.yemusic.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yehowah.yemusic.R;
import com.yehowah.yemusic.utils.UserUtils;

public class MeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        initView();
    }

    private void initView() {
        initNavBar(true,"个人中心",false);


    }


    /**
     * 修改密码 点击事件
     * @param v
     */
    public void  onChangeClick(View v){
        Intent intent = new Intent(this,ChangePasswordActivity.class);
        startActivity(intent);
    }

    /**
     * 退出登录 点击事件
     * @param v
     */
    public void  onLogoutClick(View v){
        UserUtils.logout(this);//跳转到登录界面，但是点击回退按钮会回到当前界面，这是不友好的，应该直接退出app
    }
}
