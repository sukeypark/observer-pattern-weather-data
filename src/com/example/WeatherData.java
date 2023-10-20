package com.example;

import com.example.sensor.HumiditySensor;
import com.example.sensor.PressureSensor;
import com.example.sensor.Sensor;
import com.example.sensor.TemperatureSensor;

public class WeatherData {

    Sensor tempSensor = new TemperatureSensor();
    Sensor pressureSensor = new PressureSensor();
    Sensor humiditySensor = new HumiditySensor();

    public void measurementsChanged() {

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
