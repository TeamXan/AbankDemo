package com.xan.abankdemo.ui.LogIn.LogInFragment;

import android.arch.lifecycle.MutableLiveData;
import android.databinding.ObservableField;
import android.widget.Toast;

import com.xan.abankdemo.ui.base.BaseViewModel;

public class LogInFragmentViewModel extends BaseViewModel<LogInNavigator> {
    public LogInFragmentViewModel() {
    }
    public MutableLiveData<String> username = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();

    public void goLogin(){
        getNavigator().showToast(username.getValue(),password.getValue());

    }
}
