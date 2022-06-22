package com.andrew.homework.lesson15.temperatureconverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConverter {

    public static final String fahrenheitTemperatureName = "Fahrenheit";
    public static final String kalvinTemperatureName = "Kalvin";
    public static final String celsiusTemperatureName = "Celsius";
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        convertTemperature();
    }

    private static void convertTemperature() throws IOException {
        String inputOriginalTemperature;
        System.out.println("Input type of converted temperature: Celsius, Fahrenheit or Kalvin, or input stop for process finishing");
        while (!(inputOriginalTemperature = READER.readLine()).equals("stop")) {
            switch (inputOriginalTemperature) {
                case "Celsius":
                    System.out.println("Input temperature type for converting: Fahrenheit or Kalvin");
                    String inputNewTemperature = READER.readLine();
                    float temperatureValueForConvert = performConverting(inputNewTemperature, fahrenheitTemperatureName, kalvinTemperatureName);
                    CelsiusTemperature celsius = new CelsiusTemperature(inputNewTemperature, temperatureValueForConvert);
                    convert(celsius);
                    break;
                case "Fahrenheit":
                    System.out.println("Input temperature type for converting: Celsius or Kalvin");
                    inputNewTemperature = READER.readLine();
                    temperatureValueForConvert = performConverting(inputNewTemperature, celsiusTemperatureName, kalvinTemperatureName);
                    FahrenheitTemperature fahrenheit = new FahrenheitTemperature(inputNewTemperature, temperatureValueForConvert);
                    convert(fahrenheit);
                    break;
                case "Kalvin":
                    System.out.println("Input temperature type for converting: Celsius or Fahrenheit");
                    inputNewTemperature = READER.readLine();
                    temperatureValueForConvert = performConverting(inputNewTemperature, celsiusTemperatureName, fahrenheitTemperatureName);
                    KalvinTemperature kalvin = new KalvinTemperature(inputNewTemperature, temperatureValueForConvert);
                    convert(kalvin);
                    break;
            }
            System.out.println("Input type of converted temperature: Celsius, Fahrenheit or Kalvin, or input stop for process finishing");
        }
    }

    private static float performConverting(String inputNewTemperature, String temperature1, String temperature2) throws IOException {
        float convertedTemperature = 0;
        if (inputNewTemperature.equals(temperature1)) {
            System.out.println("Input value of Degrees");
            convertedTemperature = Float.parseFloat(READER.readLine());
        } else if (inputNewTemperature.equals(temperature2)) {
            System.out.println("Input value of Degrees");
            convertedTemperature = Float.parseFloat(READER.readLine());
        } else {
            System.out.println("This type of temperature isn't provided");
        }
        return convertedTemperature;
    }

    private static void convert(Convertable convertable) {
        convertable.convert();
    }
}
