package com.example.binartalent

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface API {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "e458ef52807d114d92f614b11735092d",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>


    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "e458ef52807d114d92f614b11735092d",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "e458ef52807d114d92f614b11735092d",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}