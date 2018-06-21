package com.project.dagger2di.module;

import android.content.Context;

import com.project.dagger2di.applicationFeature.ApplicationScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by skynet on 6/20/18.
 */
@Module
public class ActivityModule {
    Context context;

    public ActivityModule(Context context) {
        this.context = context;
    }

    @ApplicationScope
    @Named("activity_context")
    @Provides
    public Context context() {
        return context;
    }

}
