package com.chinapost.imoocmusic.utils;

import android.content.Context;

import com.blankj.utilcode.util.ToastUtils;
import com.chinapost.imoocmusic.R;

/**
 * 吐司工具类
 */
public class ToastCustom {


    public static void showShort(Context context,String content){
        ToastUtils.setBgColor(context.getResources().getColor(R.color.mainColor));
        ToastUtils.setMsgColor(context.getResources().getColor(android.R.color.white));
        ToastUtils.showShort(content);
    }
}
