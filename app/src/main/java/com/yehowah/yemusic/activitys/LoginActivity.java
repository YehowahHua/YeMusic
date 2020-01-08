package com.yehowah.yemusic.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yehowah.yemusic.R;
import com.yehowah.yemusic.utils.UserUtils;
import com.yehowah.yemusic.views.InputView;

//
public class LoginActivity extends BaseActivity {

    private InputView mInputPhone, mInputPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }


    private void initView(){
        //NavigationBar 顶部导航 （父类）
        initNavBar(false,"登录",false);
        mInputPhone = fd(R.id.input_phone);
        mInputPassword = fd(R.id.input_password);
    }

    /**
     * 点击事件：跳转到注册页面
     */
    public void onRegisterClick(View v){

    }

    /**
     * 登录
     */
    public void onCommitClick(View v){
        String phone = mInputPhone.getInputStr();
        String password = mInputPassword.getInputStr();
        //验证用户输入是否合法
        if (!UserUtils.yalidateLogin(this, phone, password)){
            return;
        }
        //跳转到应用主页
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
