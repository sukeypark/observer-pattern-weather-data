package com.example;

import java.util.ArrayList;
import java.util.List;
import com.example.observer.CurrentConditionsDisplay;
import com.example.observer.ForecastDisplay;
import com.example.observer.Observer;
import com.example.observer.StatisticsDisplay;

public class WeatherData implements Subject {

    private List<Observer> observers = new ArrayList<>();

    // states
    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherStation weatherStation = new WeatherStation();

    public void measurementsChanged() {

        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();
    }

    public float getTemperature() {
        float temp = /* codes for periodically pulling data */ 0.1f;
        return temp;
    }

    public float getHumidity() {
        float humidity = /* codes for periodically pulling data */ 0.1f;
        return humidity;
    }

    public float getPressure() {
        float pressure = /* codes for periodically pulling data */ 0.1f;
        return pressure;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

}
