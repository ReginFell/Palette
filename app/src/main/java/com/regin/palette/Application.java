package com.regin.palette;

import com.regin.palette.injection.component.AppComponent;
import com.regin.palette.injection.component.DaggerAppComponent;
import com.regin.palette.injection.module.AppModule;

public class Application extends android.app.Application {

    private static Application mApplication;

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }

    public static Application getApplication() {
        return mApplication;
    }

    public AppComponent getAppComponent() {
        if (mAppComponent == null) {
            mAppComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .build();
        }
        return mAppComponent;
    }
}
