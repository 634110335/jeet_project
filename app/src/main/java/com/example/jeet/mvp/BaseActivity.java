package com.example.jeet.mvp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<P extends BasePresent,CONTRACT> extends AppCompatActivity {
    protected P mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
        initData();
        //init
        //in
        //好的
        mPresenter = getPresenter();
        mPresenter.bindView(this);
    }

    protected abstract CONTRACT getContract();
    protected abstract int getLayoutId();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract P getPresenter();
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null){
            mPresenter.unBindView();
        }
    }
}
