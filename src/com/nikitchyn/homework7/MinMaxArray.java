package com.nikitchyn.homework7;

import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        int minValue, maxValue;
        //Діапазон рандом
        minValue = -20;
        maxValue = 20;
        boolean outCycle = false;
        do {
            //З допомогою введення через термінул. Задайте довжину масиву, щоб потім його створити.
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть розмірність масиву(ціле число) ,більше 0: ");
            if (scanner.hasNextInt()) {
                // Заповнити масив рандомними елементами від -20 до 20
                int a = scanner.nextInt();
                if (a > 0) {
                    int[] arrayDig = new int[a];
                    for (int i = 0; i < a; i++) {
                        arrayDig[i] = randomValue(minValue, maxValue);
                        System.out.print(arrayDig[i] + (i == arrayDig.length - 1 ? "" : ","));
                    }
                    System.out.println();
                    //Створіть метод для знаходження максимального елемента.
                    System.out.println("Максимальне значення: " + maxInArray(arrayDig));
                    //Створіть метод для знаходження мінімального елемента.
                    System.out.println("Мінімальне значення: " + minInArray(arrayDig));
                    //Створіть метод для знаходження середнього значення.
                    System.out.printf("Середнє значення:  %.2f \n", averageInArray(arrayDig));
                    outCycle = true;
                } else {
                    System.out.println("Введене значення менше нуля");
                }
            } else {
                System.out.println("Ви не ввели ціле число");
            }
        } while (!outCycle);
    }

    /**
     * Повертає середнє значення в масиві
     *
     * @param arrayDig Массив
     */
    private static double averageInArray(int[] arrayDig) {
        double average = 0;
        for (int i : arrayDig) {
            average += i;
        }
        return average / arrayDig.length;
    }

    /**
     * Повертає мінімальне значення в масиві
     *
     * @param arrayDig Массив
     */
    private static int minInArray(int[] arrayDig) {
        int min = arrayDig[0];
        for (int i : arrayDig) {
            if (i < min) min = i;
        }
        return min;
    }

    /**
     * Повертає максимальне значення в масиві
     *
     * @param arrayDig Массив
     */
    private static int maxInArray(int[] arrayDig) {
        int max = arrayDig[0];
        for (int i : arrayDig) {
            if (i > max) max = i;
        }
        return max;
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
