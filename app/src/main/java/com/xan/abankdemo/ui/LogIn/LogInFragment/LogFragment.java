package com.xan.abankdemo.ui.LogIn.LogInFragment;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.ObservableField;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.xan.abankdemo.BR;
import com.xan.abankdemo.R;
import com.xan.abankdemo.databinding.LoginFragBinding;
import com.xan.abankdemo.ui.base.BaseFragment;
import com.xan.abankdemo.ui.base.BaseViewModel;
import com.xan.abankdemo.utili.ViewModelProviderFactory;

import javax.inject.Inject;

public class LogFragment extends BaseFragment<LoginFragBinding,LogInFragmentViewModel>implements LogInNavigator {

    @Inject
    ViewModelProviderFactory factory;
    private LogInFragmentViewModel logInFragmentViewModel;

    public static final String TAG = LogFragment.class.getSimpleName();
    public static LogFragment newInstance() {
        Bundle args = new Bundle();
        LogFragment fragment = new LogFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.login_frag;
    }

    @Override
    public LogInFragmentViewModel getViewModel() {
        logInFragmentViewModel = ViewModelProviders.of(this, factory).get(LogInFragmentViewModel.class);
        return logInFragmentViewModel;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logInFragmentViewModel.setNavigator(this);


    }
    public void showToast(String username,String password) {
        Toast.makeText(getActivity(), "User Name !"+username+" Password !"+password,
                Toast.LENGTH_LONG).show();

    }
}
