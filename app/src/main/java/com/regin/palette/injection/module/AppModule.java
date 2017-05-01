package com.regin.palette.injection.module;

import android.app.Application;
import android.content.Context;

import dagger.Module;

@Module
public class AppModule {

    private final Context mContext;

    public AppModule(Application application) {
        mContext = application;
    }
}
