package com.example.jeet.mvp;

public class LoginActivity extends BaseActivity<LoginPresenter,ILogin.VP>{
    @Override
    protected ILogin.VP getContract() {
        return new ILogin.VP() {
            @Override
            public void requestLogin(String name, String pwd) {
                mPresenter.getContract().requestLogin(name,pwd);
            }

            @Override
            public void responseLoginResult(boolean loginStatus) {

            }
        };
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected LoginPresenter getPresenter() {
        return new LoginPresenter();
    }


//    @Override
//    public void requestLogin(String name, String pwd) {
//        mPresenter.requestLogin(name,pwd);
//    }
//
//    @Override
//    public void responseLoginResult(boolean loginStatus) {
//
//    }
}
