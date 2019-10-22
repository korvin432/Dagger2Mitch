package com.mindyapps.android.dagger2mitch.network.auth;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface AuthApi {

    @GET("fake")
    Call<ResponseBody> getFakeStuff(); // just dummy method for now
}
