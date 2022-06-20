package com.nikitchyn.homework15;

public class Calculator {
    public Double calculate(double a, String operation, double b) throws UnsupportedOperationException {
        Operation action = Operation.convert(operation);
        if (action != null) {
            switch (action) {
                case ADD:
                    return add(a, b);
                case SUBTRACT:
                    return sub(a, b);
                case MULTIPLICATION:
                    return multi(a, b);
                case DIVISION:
                    return div(a, b);
            }
        }
        throw new UnsupportedOperationException(" Операція не підримується "); // операція не підтримується
    }


    public Double calculate(String a, String operation, String b) throws CalculatorException, UnsupportedOperationException {
        //    Створіть свій власний тип помилки CalculatorException() та кидайте його в новому методі вище,
        //    коли a або b не є числом
        if (!isNumeric(a)) {
            throw new CalculatorException("'a' не число:" + a);
        }
        if (!isNumeric(b)) {
            throw new CalculatorException("'b' не число:" + b);
        }
        double a1 = Double.valueOf(a);
        double b1 = Double.valueOf(b);

        Operation action = Operation.convert(operation);
        // Зробіть конструкція try-catch в новому методі
        try {
            switch (action) {
                case ADD:
                    return add(a1, b1);
                case SUBTRACT:
                    return sub(a1, b1);
                case MULTIPLICATION:
                    return multi(a1, b1);
                case DIVISION:
                    return div(a1, b1);
            }
        } catch (NullPointerException e) {
            // якщо операція не
            // підтримується виведіть в консоль повідомлення через System.err.println
            System.err.println("Операція не підримується " + e.getMessage());
        }
        // виключення, операція не підтримується
        throw new UnsupportedOperationException("Вказана операція: " + operation + " не підтримується");
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private Double div(double a, double b) throws ArithmeticException {
        if (b != 0) {
            return a / b;
        } else {
            //return 0.0;
            throw new ArithmeticException("Division by 0");
        }
    }

    private Double multi(double a, double b) {
        return a * b;
    }

    private Double sub(double a, double b) {
        return a - b;
    }

    private Double add(double a, double b) {
        return a + b;
    }
}
