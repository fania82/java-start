package com.andrew.homework.lesson15.temperatureconverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class TemperatureConverter {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.printf("%.2f", convertTemperature());
    }

    private static float convertTemperature() throws IOException {
        TemperatureType type = inputTypeOfTemperature();
        System.out.println("Input value for converting");
        float temperature = Float.parseFloat(READER.readLine());
        float convertedTemperature = 0;
        switch (type) {
            case CELSIUS:
                return new CelsiusTemperature().convert(inputTypeOfTemperature(), temperature);
            case FAHRENHEIT:
                return new FahrenheitTemperature().convert(inputTypeOfTemperature(), temperature);
            case KELVIN:
                return new KelvinTemperature().convert(inputTypeOfTemperature(), temperature);
        }
        return convertedTemperature;
    }

    public static TemperatureType inputTypeOfTemperature() throws IOException {
        try {
            System.out.println("Input temperature type: ");
            String inputTemperature = READER.readLine().toUpperCase(Locale.ROOT);
            return TemperatureType.valueOf(inputTemperature);
        } catch (RuntimeException exception) {
            return inputTypeOfTemperature();
        }
    }
}
