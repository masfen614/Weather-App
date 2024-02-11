package com.techelevator.controller;

import com.techelevator.model.LatLon;
import com.techelevator.model.WeatherObject;
import com.techelevator.service.WeatherService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

public class WeatherController {

    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    @GetMapping("/weather")
    public WeatherObject getWeather(@RequestParam String zipcode){
        //System.out.println("zip: " + zipcode);
        LatLon latLon = weatherService.getLatLon(zipcode);

        return weatherService.getWeather(latLon);
    }
}
