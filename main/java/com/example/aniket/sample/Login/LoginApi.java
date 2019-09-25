package com.example.shivani.sample.Login;

import com.example.shivani.sample.Login.Example;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by shivani on 15-11-2018.
 */

public interface LoginApi {

  //  String base_url = "http://demopay.oriole.co.in/api/";

    @POST("Auth/Auth/")
    Call<Example> getInfo(@Body Map obj);


}
