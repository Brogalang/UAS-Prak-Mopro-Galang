package com.retaurant.uas_prak_mopro_galang.model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.annotations.Expose;

public class Login {
    @Expose
    private String nama;
    @Expose
    private String userid;
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
}

