package com.nikitchyn.homework12;

public class Drinks {

    // Зробіть клас Drinks, де константами задайте ціну напою;
    private static final float COFFEE_PRICE = 2;
    private static final float TEA_PRICE = 5;
    private static final float LEMONADE_PRICE = 3;
    private static final float MOKHITO_PRICE = 4;
    private static final float MINERALK_PRICE = 1;
    private static final float COCA_COLA_PRICE = 3;
    //Зробіть підрахунок кількості зроблених напоїв
    // та загальної суми, яку повинен заплатити клієнт;
    private static float allPrice = 0;
    private static int allCount = 0;

    public void makeCofee(int count) {
        System.out.printf("Coffee: %s X %s = %.2f \n", count, COFFEE_PRICE, (count * COFFEE_PRICE));
        allPrice = allPrice + (count * COFFEE_PRICE);
        allCount = allCount + count;
    }

    public void makeTea(int count) {
        System.out.printf("Tea: %s X %s = %.2f \n", count, TEA_PRICE, (count * TEA_PRICE));
        allPrice = allPrice + (count * TEA_PRICE);
        allCount = allCount + count;
    }

    public void makeLemnonade(int count) {
        System.out.printf("Lemonade: %s X %s = %.2f \n", count, LEMONADE_PRICE, (count * LEMONADE_PRICE));
        allPrice = allPrice + (count * LEMONADE_PRICE);
        allCount = allCount + count;
    }

    public void makeMokhito(int count) {
        System.out.printf("Mokhito: %s X %s = %.2f \n", count, MOKHITO_PRICE, (count * MOKHITO_PRICE));
        allPrice = allPrice + (count * MOKHITO_PRICE);
        allCount = allCount + count;
    }

    public void makeMineralk(int count) {
        System.out.printf("Mineralk: %s X %s = %.2f \n", count, MINERALK_PRICE, (count * MINERALK_PRICE));
        allPrice = allPrice + (count * MINERALK_PRICE);
        allCount = allCount + count;
    }

    public void makeCola(int count) {
        System.out.printf("Mineralk: %s X %s = %.2f \n", count, COCA_COLA_PRICE, (count * COCA_COLA_PRICE));
        allPrice = allPrice + (count * COCA_COLA_PRICE);
        allCount = allCount + count;
    }

    public float getAllPrice() {
        return allPrice;
    }

    public int getAllCount() {
        return allCount;
    }
}
