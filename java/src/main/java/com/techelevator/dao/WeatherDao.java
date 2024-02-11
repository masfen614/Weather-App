package com.techelevator.dao;

import com.techelevator.model.LatLon;
import com.techelevator.model.User;
import com.techelevator.model.Weather;
import com.techelevator.model.WeatherObject;

public interface WeatherDao {

    WeatherObject createWeather(WeatherObject weather, LatLon latLon, User user);


    Weather getWeatherByUser(User user);
}
