package com.mindyapps.android.dagger2mitch.di.main;

import com.mindyapps.android.dagger2mitch.ui.main.posts.PostsFragment;
import com.mindyapps.android.dagger2mitch.ui.main.profile.ProfileFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();

    @ContributesAndroidInjector
    abstract PostsFragment contributePostsFragment();
}
