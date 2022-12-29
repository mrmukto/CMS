package com.social.securityms.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoginResponse {
    @SerializedName("success")
    @Expose
    private String success;
    @SerializedName("status code")
    @Expose
    private Integer statusCode;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("groups")
    @Expose
    private String groups;
    @SerializedName("user_data")
    @Expose
    private UserData userData;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }
    public class UserData {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("usr_email")
        @Expose
        private String usrEmail;
        @SerializedName("first_name")
        @Expose
        private String firstName;
        @SerializedName("last_name")
        @Expose
        private String lastName;
        @SerializedName("is_active")
        @Expose
        private Boolean isActive;
        @SerializedName("user_type")
        @Expose
        private Integer userType;
        @SerializedName("user_phone")
        @Expose
        private UserPhone userPhone;
        @SerializedName("user_address")
        @Expose
        private Object userAddress;
        @SerializedName("user_citizenship")
        @Expose
        private Object userCitizenship;
        @SerializedName("user_education")
        @Expose
        private List<Object> userEducation = null;
        @SerializedName("user_occupation")
        @Expose
        private Object userOccupation;
        @SerializedName("user_location")
        @Expose
        private List<Object> userLocation = null;
        @SerializedName("user_fcm")
        @Expose
        private Object userFcm;
        @SerializedName("user_otp")
        @Expose
        private UserOtp userOtp;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getUsrEmail() {
            return usrEmail;
        }
        public void setUsrEmail(String usrEmail) {
            this.usrEmail = usrEmail;
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

        public Boolean getIsActive() {
            return isActive;
        }

        public void setIsActive(Boolean isActive) {
            this.isActive = isActive;
        }

        public Integer getUserType() {
            return userType;
        }

        public void setUserType(Integer userType) {
            this.userType = userType;
        }

        public UserPhone getUserPhone() {
            return userPhone;
        }

        public void setUserPhone(UserPhone userPhone) {
            this.userPhone = userPhone;
        }

        public Object getUserAddress() {
            return userAddress;
        }

        public void setUserAddress(Object userAddress) {
            this.userAddress = userAddress;
        }
        public Object getUserCitizenship() {
            return userCitizenship;
        }

        public void setUserCitizenship(Object userCitizenship) {
            this.userCitizenship = userCitizenship;
        }

        public List<Object> getUserEducation() {
            return userEducation;
        }

        public void setUserEducation(List<Object> userEducation) {
            this.userEducation = userEducation;
        }

        public Object getUserOccupation() {
            return userOccupation;
        }

        public void setUserOccupation(Object userOccupation) {
            this.userOccupation = userOccupation;
        }

        public List<Object> getUserLocation() {
            return userLocation;
        }

        public void setUserLocation(List<Object> userLocation) {
            this.userLocation = userLocation;
        }

        public Object getUserFcm() {
            return userFcm;
        }

        public void setUserFcm(Object userFcm) {
            this.userFcm = userFcm;
        }

        public UserOtp getUserOtp() {
            return userOtp;
        }

        public void setUserOtp(UserOtp userOtp) {
            this.userOtp = userOtp;
        }

    }
    public class UserOtp {

        @SerializedName("otp")
        @Expose
        private Object otp;

        public Object getOtp() {
            return otp;
        }

        public void setOtp(Object otp) {
            this.otp = otp;
        }

    }
    public class UserPhone {

        @SerializedName("phn_business")
        @Expose
        private Object phnBusiness;
        @SerializedName("phn_cell")
        @Expose
        private String phnCell;
        @SerializedName("phn_home")
        @Expose
        private Object phnHome;

        public Object getPhnBusiness() {
            return phnBusiness;
        }

        public void setPhnBusiness(Object phnBusiness) {
            this.phnBusiness = phnBusiness;
        }
        public String getPhnCell() {
            return phnCell;
        }

        public void setPhnCell(String phnCell) {
            this.phnCell = phnCell;
        }

        public Object getPhnHome() {
            return phnHome;
        }

        public void setPhnHome(Object phnHome) {
            this.phnHome = phnHome;
        }

    }





    }
