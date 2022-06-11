package com.nikitchyn.homework9;

import java.util.Scanner;

public class TransportMatrix {
    public static void main(String[] args) {
        int min = 0, max = 99;//Діапазон рандомів заповнення матриці
        rezultTransportMatrix(min, max);
    }

    /**
     * Заповнює матрицю рандомом,транспонує
     *
     * @param min Від
     * @param max До
     */
    private static void rezultTransportMatrix(int min, int max) {
        //Вводимо дані
        int m = getInputIntDigitsUser("Введіть розмір матриці M: ");
        int n = getInputIntDigitsUser("Введіть розмір матриці N: ");
        //Формуємо два масиви MxN NxM
        int[][] matrixA = new int[m][n];
        int[][] matrixB = new int[n][m];
        //Заповнюємо рандомно matrixA
        getRandomMas(matrixA, min, max);
        //Виводимо matrixA
        showMatrix(matrixA);
        //Транспонуємо матрицю
        transportMatrix(matrixA, matrixB);
        //Показуємо результат
        System.out.println("----------------------------");
        showMatrix(matrixB);
    }

    /**
     * Транспонує матрицю, результат записує в matrixB
     *
     * @param matrixA початкова матриця
     * @param matrixB транспонована матриця
     */
    private static void transportMatrix(int[][] matrixA, int[][] matrixB) {

        //Транспонуємо матрицю
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixB[j][i] = matrixA[i][j];
            }
        }
    }

    /**
     * Відображає матрицю
     *
     * @param matrixA матриця для виводу
     */
    private static void showMatrix(int[][] matrixA) {
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
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
     * Заповнює матрицю рандомними значеннями
     *
     * @param matrix матриця
     * @param min    від
     * @param max    до
     */
    private static void getRandomMas(int[][] matrix, int min, int max) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomValue(min, max);
            }
        }
    }

    /**
     * Перевіряє до тих пір доки користувач не введе число
     *
     * @param messageUser повідомлення що потрібно ввести
     */
    private static int getInputIntDigitsUser(String messageUser) {
        boolean inputDigits = false;
        int a = 0;
        while (!inputDigits) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(messageUser);

            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                inputDigits = true;

            } else {
                System.out.println("Не відповідає вимогам.Повторіть");
            }
        }
        return a;
    }
}
