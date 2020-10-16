package com.example.jeet.mvp;

public class LoginPresenter extends BasePresent<LoginActivity,LoginModel,ILogin.VP>{
    @Override
    public LoginModel getModel() {
        return new LoginModel(this);
    }

    @Override
    ILogin.VP getContract() {
        return new ILogin.VP() {
            @Override
            public void requestLogin(String name, String pwd) {
                try {
                    mModel.getContract().requestLogin(name,pwd);
                }catch (Exception e){
                  e.printStackTrace();
                }
            }

            @Override
            public void responseLoginResult(boolean loginStatus) {
                mView.getContract().responseLoginResult(loginStatus);
            }
        };
    }

//    @Override
//    public void requestLogin(String name, String pwd) {
//        try {
//            mModel.requestLogin(name,pwd);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void responseLoginResult(boolean loginStatus) {
//        mView.responseLoginResult(loginStatus);
//    }
}
