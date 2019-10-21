package com.mindyapps.android.dagger2mitch.di;

import androidx.lifecycle.ViewModelProvider;

import com.mindyapps.android.dagger2mitch.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory modelProviderFactory);
}
