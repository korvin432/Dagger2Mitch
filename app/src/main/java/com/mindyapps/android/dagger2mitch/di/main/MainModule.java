package com.mindyapps.android.dagger2mitch.di.main;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.mindyapps.android.dagger2mitch.network.main.MainApi;
import com.mindyapps.android.dagger2mitch.ui.main.MainActivity;
import com.mindyapps.android.dagger2mitch.ui.main.posts.PostRecyclerAdapter;
import com.mindyapps.android.dagger2mitch.util.VerticalSpaceItemDecoration;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @MainScope
    @Provides
    static PostRecyclerAdapter provideAdapter(){
        return new PostRecyclerAdapter();
    }

    @MainScope
    @Provides
    static LinearLayoutManager provideLinearLayoutManager(MainActivity mainActivity){
        return new LinearLayoutManager(mainActivity);
    }

    @MainScope
    @Provides
    static VerticalSpaceItemDecoration provideVerticalSpaceItemDecoration(){
        return new VerticalSpaceItemDecoration(15);
    }

    @MainScope
    @Provides
    static MainApi provideMainApi(Retrofit retrofit){
        return retrofit.create(MainApi.class);
    }
}
