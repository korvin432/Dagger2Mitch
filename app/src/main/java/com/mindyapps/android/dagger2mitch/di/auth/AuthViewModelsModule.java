package com.mindyapps.android.dagger2mitch.di.auth;

import com.mindyapps.android.dagger2mitch.di.ViewModelKey;
import com.mindyapps.android.dagger2mitch.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModelKey bindAuthViewModel(AuthViewModel viewModel);
}
