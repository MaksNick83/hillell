package homework5Nikitchyn;

import java.util.Scanner;

public class InputDouble {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value: ");
        //перевіримо чи це дробовий тип
        if (scanner.hasNextDouble() && !scanner.hasNextLong()) {
            double number = scanner.nextDouble();
            int countAfterPoint = 2;
            System.out.println("result of " + countAfterPoint + " decimal: " + doubleToDecimalPlaces(number, countAfterPoint));
        } else {
            System.out.println("Not the right type");
        }
    }

    /**
     * Округлює число до заданої точності
     *
     * @param number          значення
     * @param countAfterPoint кількість знаків після коми
     */
    private static double doubleToDecimalPlaces(double number, int countAfterPoint) {
        double s = Math.pow(10, countAfterPoint);
        return Math.round(number * s) / s;
    }
}
