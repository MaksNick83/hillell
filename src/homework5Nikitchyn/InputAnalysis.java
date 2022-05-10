package homework5Nikitchyn;

import java.util.Scanner;

public class InputAnalysis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення: ");

        if (scanner.hasNextInt()) {
            //ввели ціле число
            int a = scanner.nextInt();
            //Визначаємо позитивне чи негативне виводимо для користувача результат
            System.out.println(a + " - Ви ввели  ціле число, також " + (a > 0 ? "позитивне" : "негативне"));
        } else if (scanner.hasNextDouble()) {
            //не ціле число
            double a = scanner.nextDouble();
            //Виводимо форматовано
            System.out.println(String.format("%.2f", a) + "- Ви ввели  дробне число");
        } else {
            //Це не число
            String a = scanner.nextLine();
            //Виводимо без пробілів великими літерами
            System.out.println(a.replace(" ", "").toUpperCase() + " - Ви ввели рядок ");
        }
    }


}

