package com.xan.abankdemo.utili;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.xan.abankdemo.ui.LogIn.LogInFragment.LogInFragmentViewModel;
import com.xan.abankdemo.ui.LogIn.LogInViewModel;
import com.xan.abankdemo.ui.splash.splashViewModel;

public class ViewModelProviderFactory extends ViewModelProvider.NewInstanceFactory {
    public ViewModelProviderFactory() {
    }
    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        if (modelClass.isAssignableFrom(splashViewModel.class)) {
            //noinspection unchecked
            return (T) new splashViewModel();
        }else if (modelClass.isAssignableFrom(LogInViewModel.class)) {
            //noinspection unchecked
            return (T) new LogInViewModel();
        }else if (modelClass.isAssignableFrom(LogInFragmentViewModel.class)) {
            //noinspection unchecked
            return (T) new LogInFragmentViewModel();
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
