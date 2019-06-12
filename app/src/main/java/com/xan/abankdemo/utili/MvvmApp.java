package com.xan.abankdemo.utili;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import com.xan.abankdemo.di.components.DaggerAppComponent;


public class MvvmApp extends Application implements HasActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Inject
    CalligraphyConfig mCalligraphyConfig;

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);

        //AppLogger.init();

        //AndroidNetworking.initialize(getApplicationContext());
        //if (BuildConfig.DEBUG) {
            //AndroidNetworking.enableLogging(HttpLoggingInterceptor.Level.BODY);
       // }

        CalligraphyConfig.initDefault(mCalligraphyConfig);
    }

}
