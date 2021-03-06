package com.nikitchyn.homework15;

public enum Operation {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLICATION("*"),
    DIVISION("/");

    String value;

    Operation(String value) {
        this.value = value;

    }

    public static Operation convert(String action) throws UnsupportedOperationException {
        for (Operation op : values()) {
            if (op.value.equals(action)) {
                return op;
            }
        }
        throw new UnsupportedOperationException("Вказана операція: " + action + " не підтримується");
    }
}
