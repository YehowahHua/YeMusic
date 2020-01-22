package com.yehowah.yemusic.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;
import com.yehowah.yemusic.R;
import com.yehowah.yemusic.activitys.LoginActivity;

public class UserUtils {
    /**
     * 验证登录用户输入合法性
     */
    public static boolean yalidateLogin(Context context, String phone, String password){
//        RegexUtils.isMobileSimple(phone);//简单的
//        RegexUtils.isMobileExact(phone);//精确的
        if ( !RegexUtils.isMobileExact(phone)){
            Toast.makeText(context, "无效手机号", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(password)){
            Toast.makeText(context, "请输入密码", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }


    /**
     * 退出登录
     */
    public static void logout(Context context){
        Intent intent = new Intent(context, LoginActivity.class);
        //添加Intent标志符，清理task栈，并且新生成一个task栈
        //作用是返回键，返回不会回到之前的栈中 （android全面屏不能回退）
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);

        //activity的过渡动画和主栈不同 解决办法,(注意的是要在startActivity之后)
        ((Activity)context).overridePendingTransition(R.anim.open_enter, R.anim.open_exit);
    }
}
