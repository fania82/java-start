package com.andrew.homework.lesson15.temperatureconverter;

public class CelsiusTemperature implements Convertable {

    @Override
    public float convert(TemperatureType type, float convertedTemperature) {
        if (type.equals(TemperatureType.FAHRENHEIT)) {
            return convertedTemperature * 1.8f + 32;
        } else if (type.equals(TemperatureType.KELVIN)) {
            return convertedTemperature + 273.15f;
        } else {
            return convertedTemperature;
        }
    }
}
