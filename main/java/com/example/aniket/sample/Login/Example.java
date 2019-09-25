package com.example.shivani.sample.Login;

/**
 * Created by shivani on 16-11-2018.
 */



        import java.util.List;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class  Example{
    @SerializedName("data")
    @Expose
    private List<LoginInfo> data = null;
    @SerializedName("Message")
    @Expose
    private String message;

    public List<LoginInfo> getData() {
        return data;
    }

    public void setData(List<LoginInfo> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}