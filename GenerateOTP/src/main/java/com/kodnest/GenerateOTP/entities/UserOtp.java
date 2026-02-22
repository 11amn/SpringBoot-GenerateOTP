package com.kodnest.GenerateOTP.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

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

    @Column
    private LocalDateTime createdTime;

    public UserOtp() {
        super();
    }

    public UserOtp(int otpId, String otp, int userId, LocalDateTime createdTime) {
        this.otpId = otpId;
        this.otp = otp;
        this.userId = userId;
        this.createdTime = createdTime;
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

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }
}
