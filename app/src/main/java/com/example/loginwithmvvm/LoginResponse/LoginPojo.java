
package com.example.loginwithmvvm.LoginResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginPojo {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("lab")
    @Expose
    private Boolean lab;
    @SerializedName("user_data")
    @Expose
    private UserData userData;
    @SerializedName("status")
    @Expose
    private Integer status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getLab() {
        return lab;
    }

    public void setLab(Boolean lab) {
        this.lab = lab;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
