package com.nikitchyn.homework15;

public class Calculator {
    public Double calculate(double a, String operation, double b) {
        try {
            Operation action = Operation.convert(operation);

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
        } catch (UnsupportedOperationException e) {
            System.err.println("Вказана операція: " + operation + " не підтримується");
        }
        return -1.0;
    }


    public Double calculate(String a, String operation, String b) throws CalculatorException {
        //    Створіть свій власний тип помилки CalculatorException() та кидайте його в новому методі вище,
        //    коли a або b не є числом

        isNumber(a, "'a' не число:");
        isNumber(b, "'b' не число:");

        return calculate(Double.valueOf(a), operation, Double.valueOf(b));

    }

    private void isNumber(String b, String x) {
        if (!isNumeric(b)) {
            throw new CalculatorException(x + b);
        }
    }


    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private Double div(double a, double b) throws ArithmeticException {
        if (b != 0) {
            return a / b;
        } else {

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
