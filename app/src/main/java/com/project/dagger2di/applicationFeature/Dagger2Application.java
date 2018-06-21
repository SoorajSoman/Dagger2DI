package com.project.dagger2di.applicationFeature;

import android.app.Activity;
import android.app.Application;

import com.project.dagger2di.component.DaggerRandomUserComponent;
import com.project.dagger2di.component.RandomUserComponent;
import com.project.dagger2di.module.ContextModule;

import timber.log.Timber;

/**
 * Created by skynet on 6/20/18.
 */

public class Dagger2Application extends Application {

    private RandomUserComponent randomUserApplicationComponent;

    public static Dagger2Application get(Activity activity) {
        return (Dagger2Application) activity.getApplication();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());

        randomUserApplicationComponent = DaggerRandomUserComponent.builder()
                .contextModule(new ContextModule(this))
                .build();
    }

    public RandomUserComponent getRandomUserApplicationComponent() {
        return randomUserApplicationComponent;
    }

}
