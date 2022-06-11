package com.nikitchyn.homework8;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int countElement = 10, minRandom = 0, maxRandom = 10;
        searchInArray(countElement, minRandom, maxRandom);
    }

    private static void searchInArray(int countElement, int minRandom, int maxRandom) {
        int[] array = getRandomMas(countElement, minRandom, maxRandom);
        Arrays.sort(array); //сортування
        int min = array[0];
        int max = array[array.length - 1];
        int inputDigits = getInputDigitsUser(min, max);
        System.out.println(Arrays.toString(array));
        ArrayByBinarySearchAndOut(array, inputDigits);
    }

    private static int getInputDigitsUser(int min, int max) {
        boolean inputDigits = false;
        int a = 0;
        while (!inputDigits) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть ціле число в діапазоні від " + min + " до " + max + ": ");

            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                if ((a >= min) && (a <= max)) {
                    inputDigits = true;
                } else {
                    System.out.println("Не відповідає вимогам.Повторіть");
                }

            } else {
                System.out.println("Не відповідає вимогам.Повторіть");
            }
        }
        return a;
    }

    private static int[] getRandomMas(int countElement, int min, int max) {
        int[] first = new int[countElement];
        for (int i = 0; i < countElement; i++) {
            first[i] = randomValue(min, max);
        }
        return first;
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

    /**
     * Виводить користовачу знайдену позицію по елементу в масиві
     *
     * @param array масив
     * @param value значення
     */
    public static void ArrayByBinarySearchAndOut(int[] array, int value) {
        int begPos = 0, endPos = array.length - 1, find;
        int k = 0;
        while (begPos <= endPos) {
            k++;
            find = (begPos + endPos) / 2;//получаємо середину
            if (array[find] < value) {//зміщуэмся в право
                begPos = find + 1;
            } else if (array[find] > value) { //зміщуємся в ліво
                endPos = find - 1;
            } else {
                System.out.println("Элемент " + value + " знайдений на позиції " + find + ".Кількість ітерацій: " + k);
                break;
            }
        }
        if (begPos > endPos) {
            System.out.println("Элемент " + value + " не знайдено.");
        }
    }

}
