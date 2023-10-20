package com.example;

import com.example.display.CurrentConditionsDisplay;
import com.example.display.Displayable;
import com.example.display.ForecastDisplay;
import com.example.display.StatisticsDisplay;

public class WeatherData {

    WeatherStation weatherStation = new WeatherStation();

    // display
    Displayable currentConditionsDisplay = new CurrentConditionsDisplay();
    Displayable forecastDisplay = new ForecastDisplay();
    Displayable statisticsDisplay = new StatisticsDisplay();

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
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

}
