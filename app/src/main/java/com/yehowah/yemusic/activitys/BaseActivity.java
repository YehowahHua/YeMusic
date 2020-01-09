package com.yehowah.yemusic.activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yehowah.yemusic.R;

public class BaseActivity extends Activity {
    private ImageView mIvBack,mIvMe;
    private TextView mTvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //封装findViewById，返回View的一个子类
    protected <T extends View> T fd(@IdRes int id){
        return findViewById(id);
    }



    /**
     * 初始化NavigationBar
     * @param isShowBack 后退按钮
     * @param title 页面名称
     * @param isShowMe 最右边的me
     */
    protected void initNavBar(boolean isShowBack,String title,boolean isShowMe){
        mIvBack = (ImageView) fd(R.id.iv_back);
        mIvMe = (ImageView) fd(R.id.iv_me);
        mTvTitle = (TextView) fd(R.id.tv_title);

        mIvBack.setVisibility(isShowBack ? View.VISIBLE : View.GONE);
        mIvMe.setVisibility(isShowMe ? View.VISIBLE : View.GONE);
        mTvTitle.setText(title);

        mIvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();//后退事件
            }
        });

        mIvMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到个人中心页面
                startActivity(new Intent(BaseActivity.this, MeActivity.class));
            }
        });


    }
}
