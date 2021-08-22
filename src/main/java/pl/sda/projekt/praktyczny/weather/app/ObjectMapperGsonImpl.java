package pl.sda.projekt.praktyczny.weather.app;

import com.google.gson.Gson;
import com.mashape.unirest.http.ObjectMapper;

public class ObjectMapperGsonImpl implements ObjectMapper {

    private final Gson gson;

    public ObjectMapperGsonImpl() {
        gson = new Gson();

    } //do gsona nie trzeba robic sprawdzania bledow

    @Override
    public <T> T readValue(String s, Class<T> aClass) {
        return gson.fromJson(s, aClass);
    }

    @Override
    public String writeValue(Object o) {
        return gson.toJson(o);
    }
}
