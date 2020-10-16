package com.example.jeet.mvp;

public abstract class BasePresent<V extends BaseActivity,M extends BaseModel,CONTRACT> extends SuperBase<CONTRACT> {
    protected V mView;
    protected M mModel;

    public BasePresent() {
        this.mModel = getModel();
    }

    public void bindView(V view){
        this.mView = view;
    }

    public void unBindView(){
        this.mView = null;
    }

   public abstract M getModel();
}
