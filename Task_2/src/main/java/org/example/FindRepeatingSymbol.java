package org.example;

import java.util.HashMap;

/**
 * Вывод в консоль информации о количестве повторяющихся символов в строке.
 */
public class FindRepeatingSymbol {

    /**
     * Выводит в консоль информацию о повторяющихся символов в проверяемой строке.
     * @param word Проверяемая строка.
     */
    public static void findRepeatingSymbol (String word) {
        HashMap<Character, Integer> symbolCount = new HashMap<>();

        // Подсчет числа повторений символов.
        for (char s : word.toCharArray()) {
            symbolCount.put(s, symbolCount.getOrDefault(s, 0) + 1);
        }

        // Поиск и вывод повторяющихся символов.
        System.out.print("Повторяющиеся символы: ");
        boolean foundDuplicate = false;
        for (char s : symbolCount.keySet()) {
            if (symbolCount.get(s) > 1) {
                System.out.print(s + " ");
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("Нет повторяющихся символов.");
        } else {
            System.out.println();
        }
    }
}
