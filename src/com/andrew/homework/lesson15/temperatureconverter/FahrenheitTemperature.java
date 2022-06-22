package com.andrew.homework.lesson15.temperatureconverter;

public class FahrenheitTemperature extends Temperature implements Convertable {
    @Override
    public void convert() {
        if (typeOfNewTemperature.equals("Celsius")) {
            System.out.println("Temperature in Celsius is: " + convertFahrenheitToCelsius(convertedTemperature) + " Degrees");
        } else if (typeOfNewTemperature.equals("Kalvin")) {
            System.out.println("Temperature in Kalvins is: " + convertFahrenheitToKalvin(convertedTemperature) + " Degrees");
        } else {
            System.out.println("This type of temperature isn't provided");
        }
    }

    public FahrenheitTemperature(String typeOfNewTemperature, float convertedTemperature) {
        super(typeOfNewTemperature, convertedTemperature);
    }

    public float convertFahrenheitToCelsius(float convertedTemperature) {
        return (convertedTemperature - 32) * 5 / 9;
    }

    public float convertFahrenheitToKalvin(float convertedTemperature) {
        return (convertedTemperature + 459.67f) * 5 / 9;
    }
}
