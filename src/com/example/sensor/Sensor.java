package com.example.sensor;

public abstract class Sensor {

    protected float value;

    public void setValue(float value) {
        this.value = value;
    }

    public float getValue() {
        return this.value;
    }

    abstract public void measure();

}
