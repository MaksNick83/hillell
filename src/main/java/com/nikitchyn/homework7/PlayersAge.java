package com.nikitchyn.homework7;

import java.util.Arrays;

public class PlayersAge {
    public static void main(String[] args) {
        int countPlayer = 25, minYear = 18, maxYear = 40;
        int[] commandOne = new int[countPlayer];
        int[] commandTwo = new int[countPlayer];
        double sumYearCommand1 = 0, sumYearCommand2 = 0;
        for (int i = 0; i < countPlayer; i++) {
            //генеруємо вік
            commandOne[i] = randomValue(minYear, maxYear);
            commandTwo[i] = randomValue(minYear, maxYear);
            //сумуємо вік
            sumYearCommand1 += commandOne[i];
            sumYearCommand2 += commandTwo[i];
            //контантинуємо вік гравців, для ввиводу в рызних рядках
            // *краще використати Arrays.toString()
            // playersOneCommand += commandOne[i] + (i == commandOne.length - 1 ? "" : ",");
            //playersTwoCommand += commandTwo[i] + (i == commandTwo.length - 1 ? "" : ",");
        }
        System.out.println("Вік гравців першої команди: " + Arrays.toString(commandOne));
        System.out.printf("Середній вік гравців першої команды: %.2f \n", sumYearCommand1 / countPlayer);
        System.out.println("Вік гравців другої команди: " + Arrays.toString(commandTwo));
        System.out.printf("Середній вік гравців першої команды: %.2f \n", sumYearCommand2 / countPlayer);
    }


    /**
     * Повертає випадкове ціле число в заданому діапазоні
     *
     * @param minCount Від
     * @param maxCount До
     */
    private static int randomValue(int minCount, int maxCount) {
        return minCount + (int) (Math.random() * ((maxCount - minCount) + 1));
    }
}