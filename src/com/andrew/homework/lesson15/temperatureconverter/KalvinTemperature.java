package com.andrew.homework.lesson15.temperatureconverter;

public class KalvinTemperature extends Temperature implements Convertable {
    @Override
    public void convert() {
        if (typeOfNewTemperature.equals("Celsius")) {
            System.out.println("Temperature in Celsius is: " + convertKalvinToCelsius(convertedTemperature) + " Degrees");
        } else if (typeOfNewTemperature.equals("Fahrenheit")) {
            System.out.println("Temperature in Fahrenheit is: " + convertKalvinToFahrenheit(convertedTemperature) + " Degrees");
        } else {
            System.out.println("This type of temperature isn't provided");
        }
    }

    public KalvinTemperature(String typeOfNewTemperature, float convertedTemperature) {
        super(typeOfNewTemperature, convertedTemperature);
    }

    public float convertKalvinToCelsius(float convertedTemperature) {
        return convertedTemperature - 273.15f;
    }

    public float convertKalvinToFahrenheit(float convertedTemperature) {
        return (convertedTemperature * (9 / 5)) - 459.67f;
    }
}
