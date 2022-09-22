package com.santhosh.moviesteamingapp.api

import com.santhosh.moviesteamingapp.model.HomePageModel
import retrofit2.Call
import retrofit2.http.GET

interface HomePageApi {

    @GET("/movies")
    fun getAllMovies():Call<List<HomePageModel>>
}