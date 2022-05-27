package com.nikitchyn.homework10;

//Зробити клас BurgerHouse, в якому створити три різні бургери. Їхній склад буде автоматично виводитися на екран під час запуску програми.
public class BurgerHouse {
    //З подвійним мясом
    public Burger createMeet() {
        return new BurgerTwoMeet(1, 2, 1, 1, 1);
    }

    //Без майонезу
    public Burger createVeg() {
        return new BurgerVeg(1, 1, 1, 1);
    }

    //З одинарним мясом
    public Burger createUniversal() {
        return new Burger(1, 1, 1, 1, 1);
    }
}
