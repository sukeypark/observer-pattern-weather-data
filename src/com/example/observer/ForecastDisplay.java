package com.example.observer;

import java.util.Observable;
import java.util.Observer;

import com.example.WeatherData;

public class ForecastDisplay implements Observer {

    private Observable observable;
    private float temp;
    private float humidity;
    private float pressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
        }
    }

}
