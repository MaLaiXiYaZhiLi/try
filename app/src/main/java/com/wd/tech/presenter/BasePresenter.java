package com.wd.tech.presenter;

import com.wd.tech.view.IBaseView;

public class BasePresenter <V extends IBaseView> {
    private V iv;
    public void attachView(V v){
        this.iv=v;
    }
    public void dettachView() {
        this.iv = null;
    }

    public V getView(){
        return iv;
    }
}
