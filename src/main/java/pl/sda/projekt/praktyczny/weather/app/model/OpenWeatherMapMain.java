package pl.sda.projekt.praktyczny.weather.app.model;

import lombok.Data;

@Data
public class OpenWeatherMapMain {

    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private double preassure;
}
