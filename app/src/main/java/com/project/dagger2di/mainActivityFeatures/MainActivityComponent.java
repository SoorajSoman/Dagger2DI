package com.project.dagger2di.mainActivityFeatures;

import com.project.dagger2di.MainActivity;
import com.project.dagger2di.component.RandomUserComponent;

import dagger.Component;

/**
 * Created by skynet on 6/20/18.
 */

@Component(modules = MainActivityModule.class, dependencies = RandomUserComponent.class)
@MainActivityScope
public interface MainActivityComponent {
    void injectMainActivity(MainActivity mainActivity);

}
