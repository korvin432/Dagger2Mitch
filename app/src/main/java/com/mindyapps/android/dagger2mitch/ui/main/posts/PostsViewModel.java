package com.mindyapps.android.dagger2mitch.ui.main.posts;

import android.util.Log;

import androidx.lifecycle.ViewModel;
import com.mindyapps.android.dagger2mitch.SessionManager;
import com.mindyapps.android.dagger2mitch.network.main.MainApi;
import javax.inject.Inject;

public class PostsViewModel extends ViewModel {

    private static final String TAG = "PostsViewModel";

    //inject
    private final SessionManager sessionManager;
    private final MainApi mainApi;

    @Inject
    public PostsViewModel(SessionManager sessionManager, MainApi mainApi) {
        this.sessionManager = sessionManager;
        this.mainApi = mainApi;
        Log.d(TAG, "PostsViewModel: viewmodel is working");
    }
}
