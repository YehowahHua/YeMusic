package com.yehowah.yemusic;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

//存储基本信息
public class YeApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化 AndroidUtilCode
        Utils.init(this);
    }


}
