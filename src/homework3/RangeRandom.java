package homework3;

import java.util.Scanner;

public class RangeRandom {
    public static void main(String[] args) {
        //Задача 3. Random в діапазоні
        //введемо початкові дані
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter min limit:");
        int minLimit = sc.nextInt();
        System.out.print("Enter max limit:");
        int maxLimit = sc.nextInt();
        //Необхідно визначити множник для згенерованого значення при якому результат розрахунку буде в діапазоні(включно).
        int resultRandom = minLimit + (int) (Math.random() * (maxLimit - minLimit));
        System.out.println("The random value is " + resultRandom + " between range: " + minLimit + " and " + maxLimit);
    }
}
