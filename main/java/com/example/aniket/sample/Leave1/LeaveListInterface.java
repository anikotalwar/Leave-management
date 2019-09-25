package com.example.shivani.sample.Leave1;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by shivani on 16-11-2018.
 */

public interface LeaveListInterface {

    @POST("ApplyLeave/ApplyLeave?EmpCode=EC-01&Year=2018")
    Call<LeaveList> getLeaveList();



}
