package com.xan.abankdemo.di;

import com.xan.abankdemo.ui.LogIn.LogInActivity;
import com.xan.abankdemo.ui.LogIn.LogInFragment.LogInFragModule;
import com.xan.abankdemo.ui.LogIn.LogInFragment.LogInFragProvider;
import com.xan.abankdemo.ui.LogIn.LogInModule;
import com.xan.abankdemo.ui.splash.SplashActivity;
import com.xan.abankdemo.ui.splash.SplashActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = SplashActivityModule.class)
    abstract SplashActivity bindSplashActivity();

    @ContributesAndroidInjector(modules = {LogInModule.class, LogInFragProvider.class})
    abstract LogInActivity bindLogInActivity();


}
