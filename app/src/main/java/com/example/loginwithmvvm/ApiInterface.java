package com.example.loginwithmvvm;

import com.example.loginwithmvvm.LoginResponse.LoginPojo;
import com.example.loginwithmvvm.LoginResponse.UserData;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {
    @Multipart
    @POST("auth/token/format/json")
    Call<LoginPojo> login(@Header("Authorization") String apiKey,
                          @Part("username") RequestBody email,
                          @Part("password") RequestBody password,
                          @Part("device_os") RequestBody deviceOS);
}
