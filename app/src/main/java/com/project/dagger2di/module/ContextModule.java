package com.project.dagger2di.module;

import android.content.Context;

import com.project.dagger2di.applicationFeature.ApplicationScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by skynet on 6/19/18.
 */
@Module
public class ContextModule {
    Context context;

    public ContextModule(Context context) {
        this.context = context;
    }


    @ApplicationScope
    @Named("application_context")
    @Provides
    public Context context() {
        return context.getApplicationContext();
    }
}
