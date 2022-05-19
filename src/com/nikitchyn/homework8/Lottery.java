package com.nikitchyn.homework8;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int countElement = 7, min = 0, max = 9;

        lotteryResult(countElement, min, max);

    }

    private static void lotteryResult(int countElement, int min, int max) {
        int[] first = getRandomMas(countElement, min, max);//згенерований масив
        int[] second = getInputMasUser(countElement);      // масив заповнений користувачем
        Arrays.sort(first); //сортування
        Arrays.sort(second);//сортування
        outResultLottery(first, second); //вивід результату порівння двох масивів
    }


    /**
     * порівнює два масиви,виводить користувачу індекс+1 співпавших елементів
     *
     * @param first  масив1
     * @param second масив2
     */
    private static void outResultLottery(int[] first, int[] second) {
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        int count = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                System.out.println("Співпав елемент " + first[i] + " під номером " + i );
                count++;
            }
        }
        System.out.println();
        System.out.println("К-ть співпадінь:" + count);

    }

    /**
     * повертає масив  заповнений int користувачем вказаною кылькістью елементів
     *
     * @param countElement кількість елементів
     */
    private static int[] getInputMasUser(int countElement) {
        int[] second = new int[countElement];
        int k = 0;
        int a ;
        while (k != countElement) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть ціле число,>0: ");

            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                if (a > 0) {
                    second[k] = a;
                    k++;
                } else {
                    System.out.println("Не відповідає вимогам.Повторіть");
                }

            } else {
                System.out.println("Не відповідає вимогам.Повторіть");
            }
        }
        return second;

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

}
