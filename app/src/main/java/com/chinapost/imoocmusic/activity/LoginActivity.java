package com.chinapost.imoocmusic.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.chinapost.imoocmusic.MainActivity;
import com.chinapost.imoocmusic.R;
import com.chinapost.imoocmusic.utils.UserUtils;
import com.chinapost.imoocmusic.view.InputView;

public class LoginActivity extends BaseActivity {

    private InputView inputPhone, inputPassword;

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
        inputPhone = fd(R.id.input_phone);
        inputPassword = fd(R.id.input_password);
    }


    /**
     * 跳转注册页面
     *
     * @param view
     */
    public void register(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    /**
     * 登录按钮
     * @param view
     */
    public void login(View view) {
        String phone = inputPhone.getInputStr();
        String password = inputPassword.getInputStr();
        if (!UserUtils.validateUser(this,phone,password)){
            return;
        }

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
