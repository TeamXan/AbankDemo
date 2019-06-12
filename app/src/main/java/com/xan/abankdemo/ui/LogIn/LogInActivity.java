package com.xan.abankdemo.ui.LogIn;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.xan.abankdemo.BR;
import com.xan.abankdemo.R;
import com.xan.abankdemo.databinding.ActivityLogInBinding;
import com.xan.abankdemo.ui.LogIn.LogInFragment.LogFragment;
import com.xan.abankdemo.ui.LogIn.LogInFragment.LogInNavigator;
import com.xan.abankdemo.ui.base.BaseActivity;
import com.xan.abankdemo.utili.ViewModelProviderFactory;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class LogInActivity extends BaseActivity<ActivityLogInBinding,LogInViewModel> implements
        HasSupportFragmentInjector {
    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;
    @Inject
    @Named("LogInActivity")
    ViewModelProviderFactory factory;
    ActivityLogInBinding activityLogInBinding;
    private LogInViewModel logInViewModel;
    public static Intent newIntent(Context context) {
        return new Intent(context, LogInActivity.class);
    }


    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_log_in;
    }

    @Override
    public LogInViewModel getViewModel() {
        logInViewModel = ViewModelProviders.of(this, factory).get(LogInViewModel.class);
        return logInViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLogInBinding = getViewDataBinding();
        showFragment();
    }


    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }

    private void showFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .disallowAddToBackStack()
                .add(R.id.screenContainer, LogFragment.newInstance(), LogFragment.TAG)
                .commit();
    }


   /* @Override
    public void showToast() {
        Toast.makeText(this, "+",
                Toast.LENGTH_LONG).show();
    }*/
}
