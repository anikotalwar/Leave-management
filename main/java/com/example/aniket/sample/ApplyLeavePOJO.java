package com.example.shivani.sample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ApplyLeavePOJO {

    @SerializedName("data")
    @Expose
    private String data;
    @SerializedName("Message")
    @Expose
    private String message;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}