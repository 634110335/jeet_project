package com.example.jeet.mvp;

public abstract class BaseModel<P extends BasePresent,CONTRACT> extends SuperBase<CONTRACT>{
    protected P mPresenter;

    public BaseModel(P presenter){
        this.mPresenter = presenter;
    }

}
