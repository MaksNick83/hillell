package Homework3;

import java.util.Scanner;

public class VolumeBullet {
    public static void main(String[] args) {
        //Задача 1. Порахувати вагу сніговика
        //Початкові дані, радіуси куль(м),густина(m^3)
        double r1, r2, r3, ro;
        r1 = 1;
        r2 = 0.5F;
        r3 = 0.2F;
        ro = 0.7F;
        //Розрахуємо Об'ємы кожної кулі 4/3pr^3
        double post = (4.0 / 3) * Math.PI; // постійне значення
        // Маса кулі = Густина * Об'єм
        double result = ro * ((post * Math.pow(r1, 3)) + (post * Math.pow(r2, 3)) + (post * Math.pow(r3, 3)));
        System.out.printf("Cніговик важить: = %.4f кг. \n", result);
    }
}
