package com.nikitchyn.homework6;

public class MethodFibonacci {
    public static void main(String[] args) {
        //перший та другий член рівний 1.
        //Наступний член це сума двох попередніх.Опишимо в циклі for
        int k0 = 1;
        int k1 = 1;
        int k2;
        System.out.println("Член 1: " + k0);
        System.out.println("Член 2: " + k1);
        for (int i = 3; i <= 11; i++) {
            k2 = k0 + k1;
            System.out.println("Член " + i + ": " + k2);
            k0 = k1;
            k1 = k2;
        }
    }
}
