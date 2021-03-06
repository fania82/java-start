package com.andrew.homework.lesson15.temperatureconverter;

public class FahrenheitTemperature implements Convertable {

    @Override
    public float convert(TemperatureType type, float convertedTemperature) {
        if (type.equals(TemperatureType.CELSIUS)) {
            return (convertedTemperature - 32) * 5 / 9;
        } else if (type.equals(TemperatureType.KELVIN)) {
            return (convertedTemperature + 459.67f) * 5 / 9;
        }else {
            return convertedTemperature;
        }
    }
}