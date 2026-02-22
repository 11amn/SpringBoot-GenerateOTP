package com.kodnest.GenerateOTP.entities;

import jakarta.persistence.*;

@Entity
@Table
public class UserOtp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int otpId;

    @Column
    private String otp;

    @Column
    private int userId;

    public UserOtp() {
        super();
    }

    public UserOtp(int otpId, String otp, int userId) {
        this.otpId = otpId;
        this.otp = otp;
        this.userId = userId;
    }

    public int getOtpId() {
        return otpId;
    }

    public void setOtpId(int otpId) {
        this.otpId = otpId;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
