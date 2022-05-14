package weatherapp;

import java.io.IOException;

public class WeatherApplication {
    public static void main(String[] args) throws IOException {

        WeatherAPI weatherAPI = new WeatherAPI("d62c91d494a577b873dd6f6971fc872b",
                "Hanoi", "VN");
        System.out.println(weatherAPI.getJsonAPI(weatherAPI.getLink()));
        System.out.println(weatherAPI.getWeatherData().getCoord().lon);
        System.out.println(weatherAPI.getWeatherData().getCoord().lat);
        System.out.println(weatherAPI.getWeatherData().getWeather().get(0).getMain());
        System.out.println(weatherAPI.getWeatherData().getWeather().get(0).getDescription());
        System.out.println(weatherAPI.getWeatherData().getWeather().get(0).getId());
        System.out.println(weatherAPI.getWeatherData().getWind().speed);
        System.out.println(weatherAPI.getWeatherData().getWind().deg);
        System.out.println(weatherAPI.getWeatherData().getWind().speed);
        System.out.println(weatherAPI.getWeatherData().getWind().gust);
        System.out.println(weatherAPI.getWeatherData().getMain().temp);
        System.out.println(weatherAPI.getWeatherData().getMain().feels_like);
        System.out.println(weatherAPI.getWeatherData().getMain().temp_min);
        System.out.println(weatherAPI.getWeatherData().getMain().temp_max);
        System.out.println(weatherAPI.getWeatherData().getMain().pressure);
        System.out.println(weatherAPI.getWeatherData().getMain().humidity);
        System.out.println(weatherAPI.getWeatherData().getMain().sea_level);
        System.out.println(weatherAPI.getWeatherData().getMain().grnd_level);
        System.out.println(weatherAPI.getWeatherData().getClouds().all);
        System.out.println(weatherAPI.getWeatherData().getSys().timezone);
        System.out.println(weatherAPI.getWeatherData().getSys().cod);
        System.out.println(weatherAPI.getWeatherData().getSys().id);
        System.out.println(weatherAPI.getWeatherData().getSys().name);












    }
}