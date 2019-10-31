package com.mindyapps.android.dagger2mitch.di;

import com.mindyapps.android.dagger2mitch.di.auth.AuthModule;
import com.mindyapps.android.dagger2mitch.di.auth.AuthViewModelsModule;
import com.mindyapps.android.dagger2mitch.ui.auth.AuthActivity;
import com.mindyapps.android.dagger2mitch.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();

}
