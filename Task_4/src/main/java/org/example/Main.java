package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение часовой стрелки:");
        int hours = scanner.nextInt();

        System.out.println("Введите значение минутной стрелки:");
        int minutes = scanner.nextInt();

        System.out.println("Текущее значение времени: " + hours + " часов  "
                + minutes + " минут.");
        System.out.println();

        System.out.println("Значение угла между стрелками: "
                + AngleCalculation.calculateAngle(hours, minutes) + "°.");
    }
}