package com.example.shivani.sample;

import com.example.shivani.sample.Leave1.LeaveList;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by shivani on 17-11-2018.
 */

public interface ApplyLeaveInterface {

    @POST("LeaveDetail/LeaveDetail")
    Call<ApplyLeavePOJO> getLeaveInfo(@Body Map obj);
}
