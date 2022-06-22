package com.andrew.homework.lesson15.temperatureconverter;

public class CelsiusTemperature extends Temperature implements Convertable {

    @Override
    public void convert() {
        if(typeOfNewTemperature.equals("Fahrenheit")) {
            System.out.println("Temperature in Fahrenheit is: " + convertCelsiusToFahrenheit(convertedTemperature) + " Degrees");
        } else if(typeOfNewTemperature.equals("Kalvin")) {
            System.out.println("Temperature in Kalvins is: " + convertCelsiusToKalvin(convertedTemperature) + " Degrees");
        } else {
            System.out.println("This type of temperature isn't provided");
        }
    }

    public CelsiusTemperature(String typeOfNewTemperature, float convertedTemperature) {
        super(typeOfNewTemperature, convertedTemperature);
    }

    public float convertCelsiusToFahrenheit(float convertedTemperature) {
        return (convertedTemperature * 1.8f) + 32;
    }

    public float convertCelsiusToKalvin(float convertedTemperature) {
        return convertedTemperature + 273.15f;
    }
}
