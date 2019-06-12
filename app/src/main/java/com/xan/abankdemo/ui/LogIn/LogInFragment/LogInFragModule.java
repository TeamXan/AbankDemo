package com.xan.abankdemo.ui.LogIn.LogInFragment;

import com.xan.abankdemo.utili.ViewModelProviderFactory;

import dagger.Module;
import dagger.Provides;
@Module
public class LogInFragModule {
    @Provides
    ViewModelProviderFactory provideLogInViewModel() {
        return new ViewModelProviderFactory();
    }
}
