package com.andrew.homework.lesson15.temperatureconverter;

public class KelvinTemperature implements Convertable {
    @Override
    public float convert(TemperatureType type, float convertedTemperature) {
        if (type.equals(TemperatureType.CELSIUS)) {
            return convertedTemperature - 273.15f;
        } else if(type.equals(TemperatureType.FAHRENHEIT)) {
            return (convertedTemperature * (9 / 5)) - 459.67f;
        } else {
            return convertedTemperature;
        }
    }
}
