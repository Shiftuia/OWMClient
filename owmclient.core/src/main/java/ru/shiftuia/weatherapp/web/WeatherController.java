package ru.shiftuia.weatherapp.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.shiftuia.weatherapp.client.openweathermap.OpenWeatherMapClient;
import ru.shiftuia.weatherapp.client.openweathermap.UnitFormat;
import ru.shiftuia.weatherapp.client.openweathermap.model.WeatherResponse;

import java.io.IOException;

@RestController
public class WeatherController {

    private OpenWeatherMapClient client;
    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public WeatherController(OpenWeatherMapClient openWeatherMapClient) {
        this.client = openWeatherMapClient;
    }


    @GetMapping(value = "/api/temperature", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public WeatherResponse getCityTemperature(@RequestParam(name = "cityName") String cityName,
                                     @RequestParam(required = false) String unit) throws IOException {



        return client.getCurrentCityWeather(cityName, UnitFormat.valueOf(unit));
    }

}
