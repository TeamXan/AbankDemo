package com.xan.abankdemo.ui.splash;

import com.xan.abankdemo.utili.ViewModelProviderFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class SplashActivityModule {
    @Provides
    ViewModelProviderFactory provideSplashViewModel() {
        return new ViewModelProviderFactory();
    }
}
