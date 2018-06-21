package com.project.dagger2di.component;

import com.project.dagger2di.applicationFeature.ApplicationScope;
import com.project.dagger2di.interfaces.RandomUsersApi;
import com.project.dagger2di.module.PicassoModule;
import com.project.dagger2di.module.RandomUsersModule;
import com.squareup.picasso.Picasso;

import dagger.Component;

/**
 * Created by skynet on 6/19/18.
 */
@ApplicationScope
@Component(modules = {RandomUsersModule.class, PicassoModule.class})
public interface RandomUserComponent {
    RandomUsersApi getRandomUsersApi();

    Picasso getPicasso();

}
