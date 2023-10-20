package com.example;

import com.example.sensor.HumiditySensor;
import com.example.sensor.PressureSensor;
import com.example.sensor.Sensor;
import com.example.sensor.TemperatureSensor;

public class WeatherStation {

    Sensor tempSensor = new TemperatureSensor();
    Sensor pressureSensor = new PressureSensor();
    Sensor humiditySensor = new HumiditySensor();

    public void measureData() {
        /* codes for measuring data */
    }

}
