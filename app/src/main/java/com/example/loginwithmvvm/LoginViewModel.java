package com.example.loginwithmvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.loginwithmvvm.LoginResponse.LoginPojo;
import com.example.loginwithmvvm.LoginResponse.UserData;

public class LoginViewModel extends ViewModel {
    private MutableLiveData<LoginPojo> userData=new MutableLiveData<>();
    LoginRepository repository;

    public LoginViewModel(){
        super();
        repository=new LoginRepository();
    }

    public MutableLiveData<LoginPojo> postLogin(String email, String password,String deviceType, String token){
        return userData = repository.getUserData("sandeep.sharma@successive.tech","S9718803308s","android",token);
    }
}
