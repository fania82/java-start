package com.andrew.homework.lesson15.temperatureconverter;

public class Temperature implements Convertable {

    public String typeOfNewTemperature;
    public float convertedTemperature;

    public Temperature(String typeOfNewTemperature, float convertedTemperature) {
        this.typeOfNewTemperature = typeOfNewTemperature;
        this.convertedTemperature = convertedTemperature;
    }

    @Override
    public void convert() {
    }
}
