package org.example;

/**
 * Расчет угла между часовой и минутной стрелкой на часах.
 */
public class AngleCalculation {

    private static final int HOURS_CONVERT_CONST = 30;
    private static final int MINUTES_CONVERT_CONST = 6;
    private static final int DEGREES_OF_CIRCUMFERENCE = 360;
    private static final int DEGREES_OF_HALF_CIRCUMFERENCE = 180;
    private static final double MINUTES_IN_HOURS = 60.0;

    /**
     * Рассчитывает значение угла между часовой и минутной стрелкой на часах.
     * @param hours Значение часовой стрелки.
     * @param minutes значение минутной стрелки.
     * @return Угол между часовой и минутной стрелкой.
     */
    public static double calculateAngle (int hours, int minutes) {
        double hoursInAngle = hours *  HOURS_CONVERT_CONST +
                (HOURS_CONVERT_CONST * minutes) / MINUTES_IN_HOURS;

        double minutesInAngle = minutes * MINUTES_CONVERT_CONST;

        double degree = Math.abs(hoursInAngle - minutesInAngle);

        if (degree <= DEGREES_OF_HALF_CIRCUMFERENCE) {
            return degree;
        } else {
            return DEGREES_OF_CIRCUMFERENCE - degree;
        }
    }
}
