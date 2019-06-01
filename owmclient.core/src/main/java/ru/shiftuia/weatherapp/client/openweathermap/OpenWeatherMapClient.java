package ru.shiftuia.weatherapp.client.openweathermap;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import ru.shiftuia.weatherapp.client.openweathermap.model.WeatherResponse;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Component
public class OpenWeatherMapClient {

    @Value("${openweathermap.api.url}")
    private String apiUrl;
    @Value("${openweathermap.api.key}")
    private String apiKey;

    private String weatherCallUrl;

    private RestTemplate restTemplate = new RestTemplate();
    private ObjectMapper objectMapper = new ObjectMapper();

    @PostConstruct
    public void post() {
        this.weatherCallUrl = apiUrl + "/weather";
    }

    public WeatherResponse getCurrentCityWeather(String cityName, UnitFormat unitFormat) throws IOException {

        UriComponentsBuilder builder = UriComponentsBuilder
                .fromUriString(weatherCallUrl)
                .queryParam("q", cityName)
                .queryParam("units", unitFormat.getValue())
                .queryParam("APPID", apiKey);

        String response = restTemplate.getForObject(builder.toUriString(), String.class);

        return objectMapper.readValue(response, WeatherResponse.class);

    }
}
