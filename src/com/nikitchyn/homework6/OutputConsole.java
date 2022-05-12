package com.nikitchyn.homework6;

public class OutputConsole {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                if ((i % 2) == 0) { // для парних цифри
                    System.out.print(i - j + " ");
                } else {  //Для не парних виводимо букви по аскі коду
                    System.out.print((char) ((i - j) + 64) + " ");
                }
            }
            System.out.println();//переводимо стрічку після кодного зовнішньоого циклу
        }
    }
}
