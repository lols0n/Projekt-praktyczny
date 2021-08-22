package pl.sda.projekt.praktyczny.weather.app.service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import pl.sda.projekt.praktyczny.weather.app.model.OpenWeatherMap;
import pl.sda.projekt.praktyczny.weather.app.model.OpenWeatherMapMain;

public class OpenWeatherMapService {

    private final static String APP_ID = "c3dbc42e3a5a7e20ff09587bf682edce";

    public OpenWeatherMap getWeather(String city) throws UnirestException {


    //REST version
    //GET - np. pobierani listy pracownikow
    final OpenWeatherMap weatherForSelectedCity = Unirest.get("https://api.openweathermap.org/data/2.5/weather")
         .queryString("q", city)
         .queryString("appid", APP_ID)
         .queryString("units", "metric")
         .asObject(OpenWeatherMap.class)
         .getBody();

        //replace with real implementation
//       final OpenWeatherMap openWeatherMap = new OpenWeatherMap();
//       openWeatherMap.setName("Rzeszów");
//       final OpenWeatherMapMain openWeatherMapMain = new OpenWeatherMapMain();
//       openWeatherMapMain.setTemp(20.0);
//       openWeatherMap.setMain(openWeatherMapMain);
        return weatherForSelectedCity;
    }
}
