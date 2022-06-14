package com.nikitchyn.homework15;

public class Calculator {
    public Double calculate(double a, String operation, double b) {
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
        return -1.0;
    }

    private Double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0.0;
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
