package com.mindyapps.android.dagger2mitch.di.main;

import com.mindyapps.android.dagger2mitch.network.main.MainApi;
import com.mindyapps.android.dagger2mitch.ui.main.posts.PostRecyclerAdapter;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @Provides
    static PostRecyclerAdapter provideAdapter(){
        return new PostRecyclerAdapter();
    }


    @Provides
    static MainApi provideMainApi(Retrofit retrofit){
        return retrofit.create(MainApi.class);
    }
}
