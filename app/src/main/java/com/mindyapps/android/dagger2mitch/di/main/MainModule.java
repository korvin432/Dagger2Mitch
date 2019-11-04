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

    @Provides
    static PostRecyclerAdapter provideAdapter(){
        return new PostRecyclerAdapter();
    }

    @Provides
    static LinearLayoutManager provideLinearLayoutManager(MainActivity mainActivity){
        return new LinearLayoutManager(mainActivity);
    }

    @Provides
    static VerticalSpaceItemDecoration provideVerticalSpaceItemDecoration(){
        return new VerticalSpaceItemDecoration(15);
    }

    @Provides
    static MainApi provideMainApi(Retrofit retrofit){
        return retrofit.create(MainApi.class);
    }
}
