package com.mindyapps.android.dagger2mitch.di.main;

import androidx.lifecycle.ViewModel;
import com.mindyapps.android.dagger2mitch.di.ViewModelKey;
import com.mindyapps.android.dagger2mitch.ui.main.posts.PostsViewModel;
import com.mindyapps.android.dagger2mitch.ui.main.profile.ProfileViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindProfileViewModel(ProfileViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PostsViewModel.class)
    public abstract ViewModel bindPostsViewModel(PostsViewModel viewModel);
}
