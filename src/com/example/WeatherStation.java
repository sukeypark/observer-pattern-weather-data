package com.example;

import java.util.Observer;

import com.example.observer.CurrentConditionsDisplay;
import com.example.observer.ForecastDisplay;
import com.example.observer.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        Observer forecastDisplay = new ForecastDisplay(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);

        while (true) {
            weatherData.setMeasurements(0, 0, 0);
        }

    }

}
