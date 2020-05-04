package com.yunda.aop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.yunda.aop.annotation.ClickBehavior;
import com.yunda.aop.annotation.LoginCheck;

public class MainActivity extends AppCompatActivity {
        public static final String TAG=MainActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 登录点击事件（用户行为统计）
     * @param view
     */
    @LoginCheck
    @ClickBehavior("登录")
    public void login(View view) {
        Log.e(TAG,"==登录成功==");
    }

    /**
     * 用户行为统计
     * @param view
     */
    @LoginCheck
    @ClickBehavior("我的专区")
    public void area(View view) {
        Log.e(TAG,"==跳转到area==");
        startActivity(new Intent(this,OtherActivity.class));
    }
    /**
     * 用户行为统计
     * @param view
     */
    @LoginCheck
    @ClickBehavior("优惠券")
    public void coupon(View view) {
        Log.e(TAG,"==跳转到优惠券==");
        startActivity(new Intent(this,OtherActivity.class));

    }
    /**
     * 用户行为统计
     * @param view
     */
    @LoginCheck
    @ClickBehavior("积分")
    public void score(View view) {
        //开始统计代码
        Log.e(TAG,"==跳转到积分==");
        startActivity(new Intent(this,OtherActivity.class));
        //结束统计代码
    }
}
