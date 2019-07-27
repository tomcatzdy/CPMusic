package com.chinapost.imoocmusic.activity;

import android.os.Bundle;
import android.view.View;

import com.chinapost.imoocmusic.R;
import com.chinapost.imoocmusic.view.InputView;

public class RegisterActivity extends BaseActivity {


    private InputView registerPhone,registerPassword,confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
    }

    private void initView() {
        initNavBar(true,"注册",false);
        registerPhone = fd(R.id.input_register_phone);
        registerPassword = fd(R.id.input_register_password);
        confirmPassword = fd(R.id.input_confirm_password);
    }

    public void registerConfirm(View view){

    }
}
