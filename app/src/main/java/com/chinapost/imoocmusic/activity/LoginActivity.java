package com.chinapost.imoocmusic.activity;

import android.os.Bundle;
import android.view.View;

import com.chinapost.imoocmusic.R;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    /**
     * 初始化view
     */
    private void initView() {
        initNavBar(false, "登录", false);
    }


    /**
     * 跳转注册页面
     *
     * @param view
     */
    public void register(View view) {

    }
}
