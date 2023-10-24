package com.example;

import java.util.ArrayList;
import java.util.List;
import com.example.observer.Observer;

public class WeatherData implements Subject {

    private List<Observer> observers = new ArrayList<>();

    // states
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
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
