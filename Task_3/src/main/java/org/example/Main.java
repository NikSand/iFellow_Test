package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение температуры в градусах Цельсия:");
        double celsius = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();

        System.out.println("Введите символ," +
                " в какую шкалу необходимо конвертировать температуру в Цельсиях:");
        System.out.println("K - в Кельвины, F -  в Фаренгейты:");
        String convertParameter = scanner.nextLine();

        BaseConverter baseConverter = new BaseConverter(celsius);
        double result = baseConverter.convert(convertParameter);

        if (convertParameter.equals("K")) {
            System.out.printf("%.2f°C равно %.2f° в шкале Кельвина", celsius, result);
        }
        else {
            System.out.printf("%.2f°C равно %.2f° в шкале Фаренгейта", celsius, result);
        }
    }
}