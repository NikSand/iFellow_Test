package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int size = 10;

        double [] array = new double [size];

        // Заполняем массив случайными числами от 0 до 1.
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        System.out.println("Полученный массив со случайными числами:");
        for (double num : array) {
            System.out.printf("%.2f ", num);
        }
        System.out.println();

        // Находим минимальное значение в массиве.
        double minValue = Arrays.stream(array).min().orElse(0.0);
        System.out.printf("Минимальное значение: %.2f%n", minValue);
        System.out.println();

        // Находим максимальное значение в массиве.
        double maxValue = Arrays.stream(array).max().orElse(0.0);
        System.out.printf("Максимальное значение: %.2f%n", maxValue);
        System.out.println();

        // Находим среднее значение в массиве.
        double avgValue = Arrays.stream(array).average().orElse(0.0);
        System.out.printf("Среднее значение: %.2f%n", avgValue);
    }
}
