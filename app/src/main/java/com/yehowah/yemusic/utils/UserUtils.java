package com.yehowah.yemusic.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;

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
}