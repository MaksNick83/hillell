package com.nikitchyn.homework9;

public class MathOperMatrix {
    public static void main(String[] args) {
        int m = 3, min = 0, max = 99;
        resultOperMatrix(m, min, max);
    }

    /**
     * Виводить заповнені матриці,суму матриць, добуток матриць
     *
     * @param m   розмірність матриць
     * @param min мінімальне значення для заповнення
     * @param max максимальне значення для заповнення
     */
    private static void resultOperMatrix(int m, int min, int max) {
        int[][] c = new int[m][m];
        int[][] d = new int[m][m];
        getRandomMas(c, min, max);
        System.out.println("-----Матриця C------------");
        showMatrix(c);
        getRandomMas(d, min, max);
        System.out.println("-----Матриця D------------");
        showMatrix(d);
        System.out.println("-----Сума матриць---------");
        showMatrix(sumMatrix(c, d));
        System.out.println("------Добуток матриць-----");
        showMatrix(multiplyMatrix(c, d));
    }

    /**
     * Повертає матрицю, результат добутку матриць
     *
     * @param c матриця для виводу
     * @param d матриця для виводу
     */
    private static int[][] multiplyMatrix(int[][] c, int[][] d) {
        int m = c.length;
        int[][] e = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    e[i][j] += c[i][k] * d[k][j];
                }
            }
        }
        return e;
    }

    /**
     * Повертає матрицю, результат сумавання матриць
     *
     * @param c матриця для виводу
     * @param d матриця для виводу
     */
    private static int[][] sumMatrix(int[][] c, int[][] d) {
        int m = c.length;
        int[][] e = new int[m][m];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < m; i++) {
                e[j][i] = c[j][i] + d[j][i];
            }
        }
        return e;
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


}


