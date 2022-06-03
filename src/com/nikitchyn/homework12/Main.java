package com.nikitchyn.homework12;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        System.out.println(Arrays.toString(DrinksMachine.values())); // Відображаєм список напоїв
        Drinks drinkPrice = new Drinks();//Підраховується загальна вартість та кількість напоїв

        while (true) {
            //Вибір напою
            num = getInputIntDigitsUser("Виберіть напій, вказавши цифру:");
            if (prepeaDrinks(drinkPrice, num)) break;//Замовлення завершено
        }

        System.out.println("--------До сплати всього:--------");
        System.out.println("Замовлено напоїв:" + drinkPrice.getAllCount());
        System.out.printf("Загальна вартість: %.2f\n", drinkPrice.getAllPrice());

    }

    private static boolean prepeaDrinks(Drinks drinkPrice, int num) {
        DrinksMachine drink = DrinksMachine.convert(num);
        if (drink != null) {
            //Ввід кількості напоїв
            int count = getInputIntDigitsUser("Введіть кількість:");
            //готуємо вибраний напій, в замовленій кількості,
            switch (drink) {
                case COFFEE:
                    drinkPrice.makeCofee(count);
                    break;
                case TEA:
                    drinkPrice.makeTea(count);
                    break;
                case LEMONADE:
                    drinkPrice.makeLemnonade(count);
                    break;
                case MOKHITO:
                    drinkPrice.makeMokhito(count);
                    break;
                case MINERALK:
                    drinkPrice.makeMineralk(count);
                    break;
                case COCA_COLA:
                    drinkPrice.makeCola(count);
                    break;
            }
            int cont = getInputIntDigitsUser("Бажаєте ще напій(1- так/2-ні):");
            if (cont == 2) {
                return true;
            }
        } else {
            System.out.println("Напій не знайдено повторіть вибір");

        }
        return false;
    }

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
