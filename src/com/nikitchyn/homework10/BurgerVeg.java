package com.nikitchyn.homework10;

//Зробимо для прикладу наслідування і поліморфізму
public class BurgerVeg extends Burger {

    protected BurgerVeg(int bun, int meat, int cheese, int herbs) {
        super(bun, meat, cheese, herbs);
    }


    protected BurgerVeg() {// По змовченню не створюємо
        return;
    }

    public String getName() {
        return " Без майонезу ";
    }
}
