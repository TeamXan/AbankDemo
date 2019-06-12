package com.xan.abankdemo.ui.splash;

import android.util.Log;
import android.widget.Toast;

import com.xan.abankdemo.ui.base.BaseViewModel;

import io.reactivex.Observable;
import io.reactivex.Observer;

public class splashViewModel extends BaseViewModel<splashNavigator> {
    public splashViewModel() {
    }
public void startSplash(){

    getNavigator().openLoginActivity();

    };


}
