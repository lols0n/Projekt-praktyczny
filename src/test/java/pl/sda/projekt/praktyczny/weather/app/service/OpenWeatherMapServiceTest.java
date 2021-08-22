package pl.sda.projekt.praktyczny.weather.app.service;


import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.jupiter.api.*;
import pl.sda.projekt.praktyczny.weather.app.ObjectMapperGsonImpl;
import pl.sda.projekt.praktyczny.weather.app.model.OpenWeatherMap;

class OpenWeatherMapServiceTest {


    private static OpenWeatherMapService service;

    @BeforeAll


    static void setup() {
        Unirest.setObjectMapper(new ObjectMapperGsonImpl());

        service = new OpenWeatherMapService();
    }

    @AfterAll
    static void cleaning() {
        //use it for cleaning stuff
    }

    @Test
    @DisplayName("test calling openWeather API")
    void test_calling_openweather_api() throws UnirestException {
        service = new OpenWeatherMapService();
        final OpenWeatherMap weatherForRzeszow = service.getWeather("Rzeszów");

        Assertions.assertEquals(weatherForRzeszow.getName(), "Rzeszów");
        Assertions.assertTrue(weatherForRzeszow.getMain().getTemp() > 0.0);
}

}