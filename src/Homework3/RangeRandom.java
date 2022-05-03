package Homework3;

import java.util.Scanner;

public class RangeRandom {
    public static void main(String[] args) {
        //Задача 3. Random в діапазоні
        //введемо початкові дані
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter min limit:");
        int minlimit = sc.nextInt();
        System.out.print("Enter max limit:");
        int maxlimit = sc.nextInt();
        //Необхідно визначити множник для згенерованого значення при якому результат розрахунку буде в діапазоні(включно).
        int maxlimit2 = maxlimit - minlimit;//для збереження змінної для виводу в повідомлені скористаємось таким записом
        int resultrandom = minlimit + (int) (Math.random() * (++maxlimit2));
        System.out.println("The random value is " + resultrandom + " between range: " + minlimit + " and " + maxlimit);
    }
}
