package com.nikitchyn.homework10;

//Зробимо для прикладу наслідування і поліморфізму
public class BurgerTwoMeet extends Burger {

    protected BurgerTwoMeet(int bun, int meat, int cheese, int herbs, int mayonnaise) {
        super(bun, meat, cheese, herbs, mayonnaise);
    }


    protected BurgerTwoMeet() {// По змовченню не створюємо
       // return;
    }

    public String getName() {
        return " З подвійним мясом ";
    }
}
