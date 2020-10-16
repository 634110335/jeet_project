package com.example.jeet.mvp;

public interface ILogin {

    interface M {
        void requestLogin(String name, String pwd) throws Exception;
    }

    interface VP {
        void requestLogin(String name, String pwd);

        void responseLoginResult(boolean loginStatus);
    }
}