package com.example.loginwithmvvm;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.loginwithmvvm.LoginResponse.LoginPojo;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginRepository {
    public ApiInterface apiInterface;
    private MutableLiveData<LoginPojo> userData=new MutableLiveData<>();

    public MutableLiveData<LoginPojo> getUserData(String userEmail, String password, String device, String token){
        apiInterface=RetrofitClient.create(ApiInterface.class);
        RequestBody emailPart = createPartFromString(userEmail);
        RequestBody passwordPart=createPartFromString(password);
        RequestBody deviceType=createPartFromString(device);

        apiInterface.login(token,emailPart,passwordPart,deviceType).enqueue(new Callback<LoginPojo>() {
            @Override
            public void onResponse(Call<LoginPojo> call, Response<LoginPojo> response) {
                userData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<LoginPojo> call, Throwable t) {
                userData.setValue(null);
                Log.e("",t.toString());
            }
        });
        return userData;
    }

    private RequestBody createPartFromString(String inputString) {
        return RequestBody.create(okhttp3.MultipartBody.FORM, inputString);
    }
}
