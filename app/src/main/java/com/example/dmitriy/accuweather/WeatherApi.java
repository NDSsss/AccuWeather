package com.example.dmitriy.accuweather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("weather")
    Call<WeatherModel> getWeather(@Query("q") String cityName, @Query("units") String metric, @Query("appid") String token);
    @GET("weather")
    Call<WeatherModel> getWeather(@Query("q") String cityName, @Query("appid") String token);
    //units=metric
}
