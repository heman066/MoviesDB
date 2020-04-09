package com.example.moviesdb;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    String BASE_URL = "http://api.themoviedb.org/3/movie/";
    //String API_KEY = "2f677eaf91dfcfe58fde3e6114a462f3";

    @GET("top_rated")
    Call<MoviesList> getTopRatedMovies(@Query("api_key") String API_KEY);

    @GET("upcoming")
    Call<MoviesList> getUpcomingMovies(@Query("api_key") String API_KEY);
}
