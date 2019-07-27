package com.chinapost.imoocmusic.utils;

import android.content.Context;
import android.text.TextUtils;

import com.blankj.utilcode.util.RegexUtils;
import com.blankj.utilcode.util.ToastUtils;

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
}
