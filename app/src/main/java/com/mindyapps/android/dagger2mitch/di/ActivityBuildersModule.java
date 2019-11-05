package com.mindyapps.android.dagger2mitch.di;

import com.mindyapps.android.dagger2mitch.di.auth.AuthModule;
import com.mindyapps.android.dagger2mitch.di.auth.AuthScope;
import com.mindyapps.android.dagger2mitch.di.auth.AuthViewModelsModule;
import com.mindyapps.android.dagger2mitch.di.main.MainFragmentBuildersModule;
import com.mindyapps.android.dagger2mitch.di.main.MainModule;
import com.mindyapps.android.dagger2mitch.di.main.MainScope;
import com.mindyapps.android.dagger2mitch.di.main.MainViewModelsModule;
import com.mindyapps.android.dagger2mitch.ui.auth.AuthActivity;
import com.mindyapps.android.dagger2mitch.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

    @MainScope
    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();



}
