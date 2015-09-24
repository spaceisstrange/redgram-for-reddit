package com.matie.redgram.ui;

import android.app.Application;

import com.matie.redgram.ui.common.utils.ToastHandler;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by matie on 06/06/15.
 */
@Module
public class AppModule {

    private App app;

    public AppModule(App app){
        this.app = app;
    }

    @Provides
    public App provideApplication(){
        return app;
    }

    @Provides
    public ToastHandler provideToastHandler(){
        return new ToastHandler(app.getApplicationContext());
    }

}
