package com.example.observer;

import com.example.Subject;

public class StatisticsDisplay implements Observer {

    private Subject weatherData;
    private float temp;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

}
