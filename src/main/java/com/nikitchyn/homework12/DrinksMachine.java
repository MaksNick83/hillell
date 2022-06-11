package com.nikitchyn.homework12;

public enum DrinksMachine {
    COFFEE(1),
    TEA(2),
    LEMONADE(3),
    MOKHITO(4),
    MINERALK(5),
    COCA_COLA(6);
    int value;

    DrinksMachine(int value) {
        this.value = value;
    }

    public static DrinksMachine convert(int num) {

        for (DrinksMachine drink : values()) {
            if (drink.value == num) {
                return drink;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return
                value + "- " + name();
    }
}

