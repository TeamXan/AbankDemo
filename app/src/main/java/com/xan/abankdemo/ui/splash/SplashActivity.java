package com.xan.abankdemo.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.arch.lifecycle.ViewModelProviders;
import android.util.Log;
import android.widget.Toast;

import com.xan.abankdemo.R;
import com.xan.abankdemo.databinding.ActivityMainBinding;
import com.xan.abankdemo.ui.LogIn.LogInActivity;
import com.xan.abankdemo.ui.base.BaseActivity;
import com.xan.abankdemo.ui.base.BaseViewModel;
import com.xan.abankdemo.utili.ViewModelProviderFactory;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity<ActivityMainBinding, splashViewModel> implements
        splashNavigator {
    Handler handler;
    @Inject
    ViewModelProviderFactory factory;
    private splashViewModel splashViewModel;

    public static Intent newIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }

    @Override
    public int getBindingVariable() {
        return 0;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    public splashViewModel getViewModel() {
        splashViewModel = ViewModelProviders.of(this, factory).get(splashViewModel.class);
        return splashViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splashViewModel.setNavigator(this);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                splashViewModel.startSplash();
                finish();
            }
        },3000);

    }

    @Override
    public void openLoginActivity() {
        Intent intent = LogInActivity.newIntent(SplashActivity.this);
        startActivity(intent);
        finish();
        Toast.makeText(this, "This is my Toast message!",
                Toast.LENGTH_LONG).show();

    }
}
