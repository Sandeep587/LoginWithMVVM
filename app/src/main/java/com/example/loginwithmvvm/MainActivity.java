package com.example.loginwithmvvm;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loginwithmvvm.LoginResponse.LoginPojo;
import com.example.loginwithmvvm.LoginResponse.UserData;

public class MainActivity extends AppCompatActivity {
    private EditText mUserEmail,mUserPassword;
    private Button mBtnLogin;
    private LoginViewModel mLoginViewModel;
    private Context mContext=this;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUserEmail=findViewById(R.id.edtEmail);
        mUserPassword=findViewById(R.id.edtPassword);
        mBtnLogin=findViewById(R.id.btnLogin);

        mLoginViewModel= ViewModelProviders.of(this).get(LoginViewModel.class);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=mUserEmail.getText().toString().trim();
                String password=mUserPassword.getText().toString().trim();
                mLoginViewModel.postLogin(email,password,"andorid",createApiAccessKey()).observe(MainActivity.this, new Observer<LoginPojo>() {
                    @Override
                    public void onChanged(@Nullable LoginPojo userData) {
                        if(userData!=null){
                            String name=userData.getUserData().getFirstName();
                            Toast.makeText(mContext,name,Toast.LENGTH_LONG).show();
                        }else {
                            Toast.makeText(mContext,"Not Good",Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
    }
    private String createApiAccessKey() {
        return mContext.getString(R.string.pattern_api_access_key,
                Base64.encodeToString(mContext.getString(R.string.pattern_api_access_key_encoded,
                        mContext.getString(R.string.coworker_api_key)).getBytes(), Base64.NO_WRAP));
    }
}