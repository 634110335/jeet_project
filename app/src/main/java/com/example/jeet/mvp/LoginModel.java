package com.example.jeet.mvp;

public class LoginModel extends BaseModel<LoginPresenter,ILogin.M>{
    public LoginModel(LoginPresenter presenter) {
        super(presenter);
    }

    @Override
    ILogin.M getContract() {
        return new ILogin.M() {
            @Override
            public void requestLogin(String name, String pwd) throws Exception {
                    mPresenter.getContract().requestLogin(name,pwd);
            }
        };
    }

//    @Override
//    public void requestLogin(String name, String pwd) throws Exception {
//       mPresenter.responseLoginResult(true);
//    }
}
