package com.project.dagger2di.mainActivityFeatures;

import com.project.dagger2di.MainActivity;
import com.project.dagger2di.adapter.RandomUserAdapter;
import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;

/**
 * Created by skynet on 6/20/18.
 */

@Module
public class MainActivityModule {
    private final MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    @MainActivityScope
    public RandomUserAdapter randomUserAdapter(Picasso picasso) {
        return new RandomUserAdapter(mainActivity, picasso);
    }

}


