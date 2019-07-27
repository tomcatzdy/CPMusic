package com.chinapost.imoocmusic.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.chinapost.imoocmusic.R;
import com.chinapost.imoocmusic.utils.UserUtils;

public class MeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        initView();
    }

    private void initView() {
        initNavBar(true,"个人中心",false);
    }

    /**
     * 修改密码
     * @param view
     */
    public void changePassword(View view) {
        Intent intent = new Intent(this,ChagePasswordActivity.class);
        startActivity(intent);
    }

    /**
     * 退出登录
     * @param view
     */
    public void loginOut(View view) {
        UserUtils.loginOut(this);
    }
}
