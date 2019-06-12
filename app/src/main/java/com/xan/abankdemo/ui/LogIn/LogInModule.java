package com.xan.abankdemo.ui.LogIn;

import com.xan.abankdemo.utili.ViewModelProviderFactory;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
@Module
public class LogInModule {

    @Provides
    @Named("LogInActivity")
    ViewModelProviderFactory provideLoginViewModelFactory() {
        return new ViewModelProviderFactory();
    }
}
