package com.example.accountopeningapi.Controller;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClint {
    public static final String BASE_URL = "http://10.11.200.106:8085/ords/emob/bankasia/agentbanking/";
    public static Retrofit retrofit;

    public static ApiInterface getApiClint(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(ApiInterface.class);
    }
}
