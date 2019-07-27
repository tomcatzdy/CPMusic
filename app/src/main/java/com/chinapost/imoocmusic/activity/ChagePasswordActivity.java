package com.chinapost.imoocmusic.activity;

import android.os.Bundle;
import android.view.View;

import com.blankj.utilcode.util.ToastUtils;
import com.chinapost.imoocmusic.R;
import com.chinapost.imoocmusic.view.InputView;

public class ChagePasswordActivity extends BaseActivity {


    private InputView inputOldPassword;
    private InputView inputNewPassword;
    private InputView inputConfirmPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chage_password);
        initView();
    }

    private void initView() {
        initNavBar(true,"修改密码",false);
        inputOldPassword = fd(R.id.input_old_password);
        inputNewPassword = fd(R.id.input_new_password);
        inputConfirmPassword = fd(R.id.confirm_old_password);
    }

    /**
     * 确认修改密码
     * @param view
     */
    public void confirmChangePassword(View view){
        ToastUtils.showShort("修改密码");
    }
}
