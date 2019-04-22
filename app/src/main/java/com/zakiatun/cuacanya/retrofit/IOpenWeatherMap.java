package com.zakiatun.cuacanya.retrofit;

import com.zakiatun.cuacanya.model.WeatherResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {
    @GET ("weather")
    Observable<WeatherResult> GetWeatherByLatLng (@Query("lat") String lat,
                                                  @Query("lon") String lng,
                                                  @Query("appid") String appid,
                                                  @Query("units") String unit);
}
