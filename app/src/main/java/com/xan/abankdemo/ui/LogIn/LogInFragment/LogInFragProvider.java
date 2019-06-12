package com.xan.abankdemo.ui.LogIn.LogInFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class LogInFragProvider {
    @ContributesAndroidInjector(modules = LogInFragModule.class)
    abstract LogFragment provideLogInFragFactory();
}
