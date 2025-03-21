package org.example;

import java.util.Locale;

/**
 * Перевод температуры по шкале Цельсия в шкалу Кельвина или Фаренгейта.
 */
public class BaseConverter {
    private double celsius;

    private final double KELVIN_CONVERT_CONST = 273.15;
    private final int FAHRENHEIT_CONVERT_CONST_1 = 9;
    private final int FAHRENHEIT_CONVERT_CONST_2 = 5;
    private final int FAHRENHEIT_CONVERT_CONST_3 = 32;

    public BaseConverter(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    /**
     * Переводит температуру по шкале Цельсия в шкалу Кельвина.
     * @return Значение температуры по шкале Кельвина.
     */
    private double convertToKelvin () {
        return celsius + KELVIN_CONVERT_CONST;
    }

    /**
     * Переводит температуру по шкале Цельсия в шкалу Фаренгейта.
     * @return Значение температуры по шкале Фаренгейта.
     */
    private double convertToFahrenheit () {
        return (celsius * FAHRENHEIT_CONVERT_CONST_1 / FAHRENHEIT_CONVERT_CONST_2)
                + FAHRENHEIT_CONVERT_CONST_3;
    }

    /**
     * Конвертирует температуру по шкале Цельсия в шкалу по Фаренгейту или Кельвина,
     * в зависимости от параметра конвертации.
     * @param convertParameter Параметр конвертации температуры в определенную шкалу.
     * @return Конвертированное значение температуры по шкале Цельсия.
     */
    public double convert (String convertParameter) {
        switch (convertParameter.toLowerCase()) {
            case "k" :
                return convertToKelvin();
            case "f":
                return convertToFahrenheit();
            default: throw new IllegalArgumentException("Неверный ввод формата. " +
                    "Пожалуйста, введите К - 'Кельвины' или F - 'Фаренгейты'.");
        }
    }
}
