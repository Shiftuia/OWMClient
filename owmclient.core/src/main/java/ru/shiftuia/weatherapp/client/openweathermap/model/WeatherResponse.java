package ru.shiftuia.weatherapp.client.openweathermap.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    @JsonProperty("coord")
    private Coordinates coordinates;
    private List<Weather> weather;
    private String base;
    private Main main;
    private Wind wind;
    private Clouds clouds;
    private Rain rain;
    @JsonProperty("dt")
    private Date date;
    @JsonProperty("sys")
    private System system;
    private long id;
    private String name;
    private long cod;   //response code?

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "coordinates=" + coordinates +
                ", weather=" + weather +
                ", base='" + base + '\'' +
                ", main=" + main +
                ", wind=" + wind +
                ", clouds=" + clouds +
                ", rain=" + rain +
                ", date=" + date +
                ", system=" + system +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                '}';
    }

    public static class Coordinates {
        private double lon;
        private double lat;

        @Override
        public String toString() {
            return "Coordinates{" +
                    "lon=" + lon +
                    ", lat=" + lat +
                    '}';
        }

        public double getLon() {
            return lon;
        }

        public double getLat() {
            return lat;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }
    }

    public static class Weather {
        private long id;
        private String main;
        private String description;
        private String icon;

        @Override
        public String toString() {
            return "Weather{" +
                    "id=" + id +
                    ", main='" + main + '\'' +
                    ", description='" + description + '\'' +
                    ", icon='" + icon + '\'' +
                    '}';
        }

        public long getId() {
            return id;
        }

        public String getMain() {
            return main;
        }

        public String getDescription() {
            return description;
        }

        public String getIcon() {
            return icon;
        }

        public void setId(long id) {
            this.id = id;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public static class Main {
        private double temp;
        private long pressure;
        private long humidity;
        @JsonProperty("temp_min")
        private double minTemp;
        @JsonProperty("temp_max")
        private double maxTemp;
        @JsonProperty("sea_level")
        private double seaLevel;
        @JsonProperty("grnd_level")
        private double groundLevel;




        public double getTemp() {
            return temp;
        }

        public long getPressure() {
            return pressure;
        }

        public long getHumidity() {
            return humidity;
        }

        public double getMinTemp() {
            return minTemp;
        }

        public double getMaxTemp() {
            return maxTemp;
        }

        public double getSeaLevel() {
            return seaLevel;
        }

        public double getGroundLevel() {
            return groundLevel;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public void setPressure(long pressure) {
            this.pressure = pressure;
        }

        public void setHumidity(long humidity) {
            this.humidity = humidity;
        }

        public void setMinTemp(double minTemp) {
            this.minTemp = minTemp;
        }

        public void setMaxTemp(double maxTemp) {
            this.maxTemp = maxTemp;
        }

        public void setSeaLevel(double seaLevel) {
            this.seaLevel = seaLevel;
        }

        public void setGroundLevel(double groundLevel) {
            this.groundLevel = groundLevel;
        }
    }

    public static class Wind {
        private double speed;
        private long deg;

        public double getSpeed() {
            return speed;
        }

        public long getDeg() {
            return deg;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public void setDeg(long deg) {
            this.deg = deg;
        }
    }


    public static class Clouds {
        private long all;


        public long getAll() {
            return all;
        }

        public void setAll(long all) {
            this.all = all;
        }
    }

    public static class Rain {
        @JsonProperty("1h")
        private long oneHour;
        @JsonProperty("3h")
        private long threeHours;


        public long getOneHour() {
            return oneHour;
        }

        public long getThreeHours() {
            return threeHours;
        }

        public void setOneHour(long oneHour) {
            this.oneHour = oneHour;
        }

        public void setThreeHours(long threeHours) {
            this.threeHours = threeHours;
        }
    }

    public static class System {
        private long type;
        private long id;
        private double message;
        private String country;
        private long sunrise;
        private long sunset;


        public long getType() {
            return type;
        }

        public long getId() {
            return id;
        }

        public double getMessage() {
            return message;
        }

        public String getCountry() {
            return country;
        }

        public long getSunrise() {
            return sunrise;
        }

        public long getSunset() {
            return sunset;
        }

        public void setType(long type) {
            this.type = type;
        }

        public void setId(long id) {
            this.id = id;
        }

        public void setMessage(double message) {
            this.message = message;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public void setSunrise(long sunrise) {
            this.sunrise = sunrise;
        }

        public void setSunset(long sunset) {
            this.sunset = sunset;
        }
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public Main getMain() {
        return main;
    }

    public Wind getWind() {
        return wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Rain getRain() {
        return rain;
    }

    public Date getDate() {
        return date;
    }

    public System getSystem() {
        return system;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getCod() {
        return cod;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }
}
