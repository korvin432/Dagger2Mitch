package com.mindyapps.android.dagger2mitch.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.mindyapps.android.dagger2mitch.network.auth.AuthApi;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";

    private final AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi) {
        this.authApi = authApi;
        Log.d(TAG, "AuthViewModel: is working");

    }
}
