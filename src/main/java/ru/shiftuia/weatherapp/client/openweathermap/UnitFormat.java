package ru.shiftuia.weatherapp.client.openweathermap;


public enum  UnitFormat {

    IMPERIAL("imperial"),
    METRIC("metric");

    private String value;

    public String getValue() {
        return value;
    }

    UnitFormat(String value) {
        this.value = value;
    }
}
