package com.example;

import com.example.display.CurrentConditionsDisplay;
import com.example.display.Displayable;
import com.example.display.ForecastDisplay;
import com.example.display.StatisticsDisplay;
import com.example.sensor.HumiditySensor;
import com.example.sensor.PressureSensor;
import com.example.sensor.Sensor;
import com.example.sensor.TemperatureSensor;

public class WeatherData {

    Sensor tempSensor = new TemperatureSensor();
    Sensor pressureSensor = new PressureSensor();
    Sensor humiditySensor = new HumiditySensor();

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
        return tempSensor.getValue();
    }

    public float getHumidity() {
        return humiditySensor.getValue();
    }

    public float getPressure() {
        return pressureSensor.getValue();
    }

}
