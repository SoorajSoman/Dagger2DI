package com.project.dagger2di.module;

import android.content.Context;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.project.dagger2di.applicationFeature.ApplicationScope;
import com.squareup.picasso.Picasso;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by skynet on 6/19/18.
 */
@Module(includes = OkHttpClientModule.class)
public class PicassoModule {
    @ApplicationScope
    @Provides
    public Picasso picasso(OkHttp3Downloader okHttp3Downloader, @Named("application_context") Context context) {
        return new Picasso.Builder(context).downloader(okHttp3Downloader).build();
    }

    @Provides
    public OkHttp3Downloader okHttp3Downloader(OkHttpClient okHttpClient) {
        return new OkHttp3Downloader(okHttpClient);
    }
}
