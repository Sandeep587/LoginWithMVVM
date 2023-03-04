
package com.example.loginwithmvvm.LoginResponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserData {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("fb_email")
    @Expose
    private Object fbEmail;
    @SerializedName("apple_email")
    @Expose
    private Object appleEmail;
    @SerializedName("login_type")
    @Expose
    private String loginType;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("profile")
    @Expose
    private String profile;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("birth_date")
    @Expose
    private String birthDate;
    @SerializedName("about_me")
    @Expose
    private String aboutMe;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("profession")
    @Expose
    private String profession;
    @SerializedName("globalpass_reservations")
    @Expose
    private Integer globalpassReservations;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("active_reservation")
    @Expose
    private List<Object> activeReservation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getFbEmail() {
        return fbEmail;
    }

    public void setFbEmail(Object fbEmail) {
        this.fbEmail = fbEmail;
    }

    public Object getAppleEmail() {
        return appleEmail;
    }

    public void setAppleEmail(Object appleEmail) {
        this.appleEmail = appleEmail;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getGlobalpassReservations() {
        return globalpassReservations;
    }

    public void setGlobalpassReservations(Integer globalpassReservations) {
        this.globalpassReservations = globalpassReservations;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<Object> getActiveReservation() {
        return activeReservation;
    }

    public void setActiveReservation(List<Object> activeReservation) {
        this.activeReservation = activeReservation;
    }

}
