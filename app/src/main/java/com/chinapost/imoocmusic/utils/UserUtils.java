package com.chinapost.imoocmusic.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import com.blankj.utilcode.util.RegexUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.chinapost.imoocmusic.R;
import com.chinapost.imoocmusic.activity.LoginActivity;

public class UserUtils {

    /**
     * 验证登录用户合法性
     */
    public static boolean validateUser(Context context, String phone, String password) {

//        RegexUtils.isMobileSimple(phone);
//
//        RegexUtils.isMobileExact(phone);

        if (!RegexUtils.isMobileExact(phone)) {
            ToastUtils.showShort("无效手机号");
            return false;
        }

        if (TextUtils.isEmpty(password)) {
            ToastUtils.showShort("请输入密码");
            return false;
        }
        return true;
    }


    public static void loginOut(Context context){
        Intent intent = new Intent(context, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
        //定义跳转动画
        ((Activity)context).overridePendingTransition(R.anim.open_enter,R.anim.open_exit);
    }
}
