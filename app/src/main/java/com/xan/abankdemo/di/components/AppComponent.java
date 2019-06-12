package com.xan.abankdemo.di.components;

import android.app.Application;

import com.xan.abankdemo.di.ActivityBuilder;
import com.xan.abankdemo.di.AppModule;
import com.xan.abankdemo.utili.MvvmApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {
    void inject(MvvmApp app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
