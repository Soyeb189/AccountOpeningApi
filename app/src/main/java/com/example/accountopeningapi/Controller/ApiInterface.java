package com.example.accountopeningapi.Controller;

import com.example.accountopeningapi.Model.AcOpenConfirmation;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("acopen")
    Call<AcOpenConfirmation> getAcOpenCOnfirmation(
            @Header("requestinfo") String requestInfo,
            @Header("user") String userId
    );
}
