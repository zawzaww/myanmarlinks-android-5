package com.zawzaw.savethelibrary.network.services;

import com.zawzaw.savethelibrary.model.gson.GsonNews;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by zawzaw on 25/12/17.
 */

public interface MainService
{
    @GET("get-news")
    Call<GsonNews> getNewsForMainSlider(@Header("Authorization") String authorization, @Query("page") int page);

}