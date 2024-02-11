package com.techelevator.dao;

import com.techelevator.model.LatLon;
import com.techelevator.model.User;
import com.techelevator.model.Weather;
import com.techelevator.model.WeatherObject;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcWeatherDao implements WeatherDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcWeatherDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public WeatherObject createWeather(WeatherObject weather, LatLon latLon, User user) {
        String sql = "INSERT INTO weather (zipcode, main, description, temperature, user_id) " +
                "VALUES(?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, latLon.getZip(),  weather.getWeather()[0].getMain(),
                weather.getWeather()[0].getDescription(),
                weather.getMain().getTemp(), user.getId());
        return null;
    }

    @Override
    public Weather getWeatherByUser(User user) {
        return null;
    }
}
