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

    public static Operation convert(String action) {
        for (Operation op : values()) {
            if (op.value.equals(action)) {
                return op;
            }
        }
        return null;
    }
}
