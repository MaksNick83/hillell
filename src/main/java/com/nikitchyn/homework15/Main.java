package com.nikitchyn.homework15;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //Операція яка не підтримується
        Calc(calculator, "5", "^", "6");
        System.out.println("------------------------------------------------------");
        //Випадок коли внесли не число
        Calc(calculator, "5,7", "^", "4");
        System.out.println("------------------------------------------------------");
        //Випадок коли все ok
        Calc(calculator, "5", "+", "4");
    }

    private static void Calc(Calculator calculator, String a, String operation, String b) {
        try {
            System.out.println(calculator.calculate(a, operation, b));
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        } catch (CalculatorException e) {
            System.out.println(e.getMessage());
        }
    }
}
